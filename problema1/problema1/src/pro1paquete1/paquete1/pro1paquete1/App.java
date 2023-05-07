package pro1paquete1;


public class App { 
    public static void main(String[] args) throws Exception {
        //creamos el objeto universidad
        universidad utpl = new universidad("Nacional UNL", "universitaria sn");   
        
        // Objeto estudiante1
        estudiante estudiante1 = new estudiante("Juan", 10.0, 10.0, 10.0, utpl);

        // Objeto estudiante2
        estudiante estudiante2 = new estudiante("Pedro", utpl);

        System.out.println(estudiante1.toString() );

        System.out.println( estudiante2.toString() ); 
    }
}
