package paquete2;

public class profesor {
    String nombre;
    String apellido;
    Double sueldoBasico;
    String cedula;

    public profesor(String nombre, String apellido, Double sueldoBasico, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;

        // El sueldo total es igual al sueldo básico más el 20% del sueldo básico.
        this.sueldoBasico = sueldoBasico + (sueldoBasico * 0.2);

    }

    public profesor(String nombre, String apellido, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nSueldo: " + this.sueldoBasico + "\nCédula: " + this.cedula;
    }
}
