package pro1paquete2;

import pro1paquete3.universidad;

public class estudiante{
    String nombreEstudiante;
    Double calficacionMateria1;
    Double calficacionMateria2;
    Double calficacionMateria3;
    Double promedioCalficaciones;
    universidad uni;

    public estudiante(String nombreEstudiante, Double calficacionMateria1, Double calficacionMateria2, Double calficacionMateria3, universidad objU){
        this.nombreEstudiante = nombreEstudiante;
        this.calficacionMateria1 = calficacionMateria1;
        this.calficacionMateria2 = calficacionMateria2;
        this.calficacionMateria3 = calficacionMateria3;
        this.promedioCalficaciones = (calficacionMateria1 + calficacionMateria2 + calficacionMateria3) / 3;
        uni = objU;
    }

    public estudiante (String nombreEstudiante, universidad objU){
        this.nombreEstudiante = nombreEstudiante;
        uni = objU;
    }

    public String toString(){ //to string: returna la informacion de mi objeto
        return "Nombre: " + nombreEstudiante + "\nCalificacion 1: " + 
        calficacionMateria1 + "\nCalificacion 2: " + calficacionMateria2 +
         "\nCalificacion 3: " + calficacionMateria3 + "\nPromedio: " +
          promedioCalficaciones + "\n Nombre u: " + uni.getNombreUni();
    }
}