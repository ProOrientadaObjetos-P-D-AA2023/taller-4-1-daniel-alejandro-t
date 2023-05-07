package paquete2;

public class estudiante{
    String nombreEstudiante;
    Double calficacionMateria1;
    Double calficacionMateria2;
    Double calficacionMateria3;
    Double promedioCalficaciones;

    public estudiante(String nombreEstudiante, Double calficacionMateria1, Double calficacionMateria2, Double calficacionMateria3){
        this.nombreEstudiante = nombreEstudiante;
        this.calficacionMateria1 = calficacionMateria1;
        this.calficacionMateria2 = calficacionMateria2;
        this.calficacionMateria3 = calficacionMateria3;
        this.promedioCalficaciones = (calficacionMateria1 + calficacionMateria2 + calficacionMateria3) / 3;
    }

    public estudiante (String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }

    public String toString(){
        return "Nombre: " + nombreEstudiante + "\nCalificacion 1: " + calficacionMateria1 + "\nCalificacion 2: " + calficacionMateria2 + "\nCalificacion 3: " + calficacionMateria3 + "\nPromedio: " + promedioCalficaciones;
    }
}