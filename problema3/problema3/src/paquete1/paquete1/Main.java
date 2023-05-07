package paquete1;

import paquete2.automotor;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creamo el primer objeto automotor
        automotor automotor1 = new automotor("123456789", "Toyota", 2010, 10000.0);

        // Creamos el segundo objeto automotor
        automotor automotor2 = new automotor("987654321", "Mazda", 2015);

        System.out.println(automotor1.toString() );
        System.out.println(automotor2.toString() );
    }
}
