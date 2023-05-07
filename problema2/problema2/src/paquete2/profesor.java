package paquete2;

import paquete3.provincia;

public class profesor {
    String nombre;
    String apellido;
    Double sueldoBasico;
    String cedula;
    provincia provinciaNacimiento;

    public profesor(String nombre, String apellido, Double sueldoBasico, String cedula, provincia provNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;

        provinciaNacimiento = provNacimiento;

        // El sueldo total es igual al sueldo básico más el 20% del sueldo básico.
        this.sueldoBasico = sueldoBasico + (sueldoBasico * 0.2);

    }

    public profesor(String nombre, String apellido, String cedula, provincia provNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;

        provinciaNacimiento = provNacimiento;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido
         + "\nSueldo: " + this.sueldoBasico + "\nCédula: " + this.cedula
         + "\nProvincia: " + provinciaNacimiento.getNombreProvincia();
    }
}
