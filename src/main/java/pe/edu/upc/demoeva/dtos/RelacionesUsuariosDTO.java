package pe.edu.upc.demoeva.dtos;

import pe.edu.upc.demoeva.entities.Usuario;

public class RelacionesUsuariosDTO {
    private int idRelacion;

    private String tipoRelacion;

    private String parentescoRelacion;

    private Usuario usuario;

    private Usuario relacionado;

    public int getIdRelacion() {
        return idRelacion;
    }

    public void setIdRelacion(int idRelacion) {
        this.idRelacion = idRelacion;
    }

    public String getTipoRelacion() {
        return tipoRelacion;
    }

    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    public String getParentescoRelacion() {
        return parentescoRelacion;
    }

    public void setParentescoRelacion(String parentescoRelacion) {
        this.parentescoRelacion = parentescoRelacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getRelacionado() {
        return relacionado;
    }

    public void setRelacionado(Usuario relacionado) {
        this.relacionado = relacionado;
    }
}
