import paquete2.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Objeto estudiante1
        estudiante estudiante1 = new estudiante("Juan", 10.0, 10.0, 10.0);

        // Objeto estudiante2
        estudiante estudiante2 = new estudiante("Pedro");

        System.out.println(estudiante1.toString() );

        System.out.println( estudiante2.toString() ); 
    }
}
