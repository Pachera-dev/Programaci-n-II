public class Profesor extends Persona {
    private String departamento;
    private double salario;
    private int añosExperiencia;

//CONSTRUCTOR
    public Profesor(String nombre, String apellido, String numeroIdentificacion, int edad, String telefono, String direccion, String departamento, double salario, int añosExperiencia) {
        super(nombre, apellido, numeroIdentificacion, edad, telefono, direccion);
        this.departamento = departamento;
        this.salario = salario;
        this.añosExperiencia = añosExperiencia;
    }

    //GETTERS Y SETTERS

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    //METODO PARA MOSTRAR INFORMACION
    public String toString() {

        return ("Departamento " + departamento +"Salario " + salario + "Años de experiencia " + añosExperiencia);
    }
    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Nombre del profesor: " + getNombre());
        System.out.println("Apellido del profesor: "+ getApellido());
        System.out.println ("Departamento: "+ getDepartamento());
        System.out.println ("Años de experiencia: "+ getAñosExperiencia());
    }

}
