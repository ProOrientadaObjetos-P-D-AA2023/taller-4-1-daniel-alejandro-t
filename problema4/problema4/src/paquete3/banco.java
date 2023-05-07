package paquete3;

public class banco {
    String nombreBanco;
    int numSucursales;

    public banco(String nombreBanco, int numSucursales){
        this.nombreBanco = nombreBanco;
        this.numSucursales = numSucursales;
    }

    public String getNombreBanco(){
        return nombreBanco;
    }
}
