public class Estudiante extends Persona {

    private int matricula;
    private String carrera;
    private double promedio;


    public Estudiante(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono, int matricula, String carrera, double promedio) {
        super( nombre, apellido, numeroIdentificacion, edad, telefono, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }
//GETTERS Y SETTERS

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }


    public String toString() {

        return ("Matricula " + matricula +"Carrera " + carrera + "Promedio " + promedio);

    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println ("Matricula" + matricula);
        System.out.println ("Carrera" + carrera);
        System.out.println ("Promedia" + promedio);
    }



    //Metodo estudiar



}

 //System.out.println ("El estudiante  " + nombre, "estudia "+ carrera );
