package pe.edu.idat.log_viewer_service.controller;

import pe.edu.idat.log_viewer_service.model.LogModel;
import pe.edu.idat.log_viewer_service.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LogViewController {
    private final LogService logService;

    public LogViewController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/logs")
    public List<LogModel> obtenerLogs() {
        return logService.obtenerTodosLogs();
    }
}