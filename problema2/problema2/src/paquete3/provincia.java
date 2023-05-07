package paquete3;

public class provincia {
    String nombreProvincia;
    int numHabitantes;

    public provincia(String nombreProv, int numHab){
        nombreProvincia = nombreProv;
        numHabitantes = numHab;

    }

    public String getNombreProvincia(){
        return nombreProvincia;
    }
}
