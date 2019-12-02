package modelo;

public class UsuarioBean {

    private String id_usuario;
    private String correo;
    private String clave;
    private boolean rol;

    public UsuarioBean(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public UsuarioBean() {
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean getRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }

}
