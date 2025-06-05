

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;
    private String direccion;
    private String telefono;

    //declaracion de constructor


    public Persona(String nombre, String apellido, String numeroIdentificacion, int edad, String telefono, String direccion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

//GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnumeroIdentificaion() {
        return numeroIdentificacion;
    }

    public void setnumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //metodo para mostrar los detalles:

    public String toString() {

        return ("Nombre: " + nombre + "Apellido: " + apellido + "Numero de identificacion: " + numeroIdentificacion+ "Edad " + edad + "Direccion: "+ direccion + "Telefono" + telefono );
    }
        public void mostrarInformacion () {
            System.out.println(this.toString());
        }

}
