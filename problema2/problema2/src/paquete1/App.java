package paquete1;

import paquete2.profesor;
import paquete3.provincia;

public class App {
    public static void main(String[] args) throws Exception {
        provincia loja = new provincia("Loja", 43430);

        provincia elOro = new provincia("El Oro", 454353495);

        // Creamos un objeto profesor1
        profesor profesor1 = new profesor("Juan", "Perez", 1000.0, "1234567890", loja);

        // Creamos un objeto profesor2
        profesor profesor2 = new profesor("Pedro", "Perez", "0987654321", elOro);

        System.out.println(profesor1.toString() );

        System.out.println( profesor2.toString() );
        

    }
}
