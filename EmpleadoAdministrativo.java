public class EmpleadoAdministrativo extends Persona {

    private String cargo;
    private String horarioTrabajo;
    private double salario;

    //CONSTRUCTOR
    public EmpleadoAdministrativo(String nombre, String apellido, String numeroIdentificacion, int edad, String telefono, String direccion, String cargo, String horarioTrabajo, double salario) {
        super(nombre, apellido, numeroIdentificacion, edad, telefono, direccion);
        this.cargo = cargo;
        this.horarioTrabajo = horarioTrabajo;
        this.salario = salario;
    }
//GETTERS Y SETTERS

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }
    //METODO
    public String toString() {

        return ("Cargo: " + cargo + "Salario: " + salario + "Horario de trabajo: " + horarioTrabajo);
    }
        //OVERRIDE
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre del empleado" + getNombre());
        System.out.println("Cargo que ocupa: " + getCargo());
        System.out.println("El salario es: " + getSalario());
        System.out.println("Horario de trabajo: " + getHorarioTrabajo());
    }
}
