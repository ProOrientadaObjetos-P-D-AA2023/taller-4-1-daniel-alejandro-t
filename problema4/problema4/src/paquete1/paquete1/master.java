package paquete1;

import paquete2.cheque;

public class master {
    public static void main(String[] args) throws Exception {
        // Cramos el objeto cheque1
        cheque cheque1 = new cheque("Juan Perez", "Banco de Gye", 1000000.0);
        
        // Creamos el objeto cheque2
        cheque cheque2 = new cheque("Maria Perez", "Banco de Pichincha");
        
        System.out.println(cheque1.toString() );

        System.out.println(cheque2.toString() );
    }
}
