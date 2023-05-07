package pro3paquete1.paquete1;

import pro3paquete2.automotor;
import pro3paquete3.fabricante;

public class Main {
    public static void main(String[] args) throws Exception {
        fabricante fabricante1 = new fabricante("Toyota", "Japon");
        fabricante fabricante2 = new fabricante("Mazda", "Japon");

        // Creamo el primer objeto automotor
        automotor automotor1 = new automotor("123456789", "Toyota", 2010, 10000.0, fabricante1);

        // Creamos el segundo objeto automotor
        automotor automotor2 = new automotor("987654321", "Mazda", 2015);

        System.out.println(automotor1.toString() );
        System.out.println(automotor2.toString() );
    }
}
