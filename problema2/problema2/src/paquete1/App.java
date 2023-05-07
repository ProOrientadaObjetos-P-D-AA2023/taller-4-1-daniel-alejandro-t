package paquete1;

import paquete2.profesor;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos un objeto profesor1
        profesor profesor1 = new profesor("Juan", "Perez", 1000.0, "1234567890");

        // Creamos un objeto profesor2
        profesor profesor2 = new profesor("Pedro", "Perez", "0987654321");

        System.out.println(profesor1.toString() );

        System.out.println( profesor2.toString() );
        

    }
}
