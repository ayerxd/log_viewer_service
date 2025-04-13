package pe.edu.idat.log_viewer_service.service;

import pe.edu.idat.log_viewer_service.model.LogModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class LogService {
    // Usamos CopyOnWriteArrayList para manejar concurrencia de forma segura
    private final List<LogModel> logs = new CopyOnWriteArrayList<>();

    public void agregarLog(LogModel log) {
        logs.add(log);
    }

    public List<LogModel> obtenerTodosLogs() {
        return new ArrayList<>(logs);
    }
}