package pe.edu.idat.log_viewer_service.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pe.edu.idat.log_viewer_service.model.LogModel;
import pe.edu.idat.log_viewer_service.service.LogService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaLogConsumer {
    private final LogService logService;
    private final ObjectMapper objectMapper;

    public KafkaLogConsumer(LogService logService, ObjectMapper objectMapper) {
        this.logService = logService;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "logs_app", groupId = "log_viewer_group")
    public void consumirLog(String mensaje) {
        try {
            LogModel log = objectMapper.readValue(mensaje, LogModel.class);
            logService.agregarLog(log);
            System.out.println("Log recibido y almacenado: " + log);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}