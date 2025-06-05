//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Anabel", "Pacher", "dni33432609", 38, "roma 1029", "tel3541335443");

        Persona persona2 = new Persona("Eliseo", "Saini", "dni53225270", 10, "Roma 1029", "tel3541335443 ");
        System.out.println(persona1);
        System.out.println(persona2);

        Estudiante estudiante1 = new Estudiante("Emma", "saini", "dni53225270", 12, "Roma 1029", "tel3541335443", 2013, "Secundario", 8.5);
        Estudiante estudiante2 = new Estudiante("Nicolas", "Saini", "dni32101844", 39, "Roma 1029", "tel3541233239", 1986, "Secundario", 9);

        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }
}