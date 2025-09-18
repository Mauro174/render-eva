package pe.edu.upc.demoeva.dtos;

import java.time.LocalDateTime;

public class ConversacionDTOList {
    private Long id;
    private Long usuarioId;
    private String canal;
    private String iniciadaPor;
    private LocalDateTime creadaEn;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
    public String getCanal() { return canal; }
    public void setCanal(String canal) { this.canal = canal; }
    public String getIniciadaPor() { return iniciadaPor; }
    public void setIniciadaPor(String iniciadaPor) { this.iniciadaPor = iniciadaPor; }
    public LocalDateTime getCreadaEn() { return creadaEn; }
    public void setCreadaEn(LocalDateTime creadaEn) { this.creadaEn = creadaEn; }
}
