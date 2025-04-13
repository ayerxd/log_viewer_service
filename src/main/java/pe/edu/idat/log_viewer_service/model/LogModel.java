package pe.edu.idat.log_viewer_service.model;

public class LogModel {
    private String origen;
    private String mensaje;
    private String nivel;

    public LogModel() {}

    public LogModel(String origen, String mensaje, String nivel) {
        this.origen = origen;
        this.mensaje = mensaje;
        this.nivel = nivel;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Log{origen='" + origen + "', mensaje='" + mensaje + "', nivel='" + nivel + "'}";
    }
}
