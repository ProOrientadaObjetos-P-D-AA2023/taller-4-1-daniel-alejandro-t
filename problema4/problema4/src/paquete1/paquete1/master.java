package paquete1;

import paquete2.cheque;
import paquete3.banco;

public class master {
    public static void main(String[] args) throws Exception {
        banco bancoDeLoja = new banco("Banco de Loja", 5);
        banco bancoDeGuayaquil = new banco("Banco de Guayaquil", 45);        

        // Cramos el objeto cheque1
        cheque cheque1 = new cheque("Juan Perez", "Banco de Gye", 1000000.0, bancoDeLoja);
        
        // Creamos el objeto cheque2
        cheque cheque2 = new cheque("Maria Perez", "Banco de Pichincha", 0, bancoDeGuayaquil);
        
        System.out.println(cheque1.toString() );

        System.out.println(cheque2.toString() );
    }
}
