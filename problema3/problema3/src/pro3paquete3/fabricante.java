package pro3paquete3;

public class fabricante {
    
    String nombreFabricante;
    String ciudadOrigen;

    public fabricante(String nombreFabricante, String ciudadOrigen){
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombreFabricante(){
        return nombreFabricante;
    }
}
