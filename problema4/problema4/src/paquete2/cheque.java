package paquete2;

public class cheque {
    String nombreCliente;
    String nombreBanco;
    double valorCheque;
    double comisionBancaria;

    public cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;

        // La comisión del banco es igual al valor del cheque por el 0.003%.
        this.comisionBancaria = this.valorCheque * 0.003;
    }

    public cheque(String nombreCliente, String nombreBanco) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = 0.0;
        this.comisionBancaria = 0.0;
    }

    public String toString() {
        return "Nombre del cliente: " + this.nombreCliente + "\n" +
               "Nombre del banco: " + this.nombreBanco + "\n" +
               "Valor del cheque: " + this.valorCheque + "\n" +
               "Comisión bancaria: " + this.comisionBancaria + "\n";
    }

}
