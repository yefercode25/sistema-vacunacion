package models;

/**
 *
 * @author JCode
 */
public class PacienteModel extends UsuarioModel {
    private String email;
    private String direccion;
    private int edad;
    private int verificado = 0;
    private String fechaCreacion;

    // Constructor para obtener toda la información
    public PacienteModel(String email, String direccion, int edad, int verificado, String fechaCreacion, int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String tipo, String ultimoAcceso) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, contraseña, telefono, tipo, ultimoAcceso);
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }
    
    // Constructor para generar la información básica
    public PacienteModel(String email, String direccion, int edad, int verificado, String fechaCreacion, int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String tipo) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, tipo);
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getVerificado() {
        return verificado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setVerificado(int verificado) {
        this.verificado = verificado;
    }
}
