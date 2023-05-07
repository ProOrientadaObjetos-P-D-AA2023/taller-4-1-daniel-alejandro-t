package pro3paquete2;

import pro3paquete3.fabricante;

public class automotor {
    String cedula;
    String marca;
    int agnoFabricacion;
    int agnoActual;
    double valorVehiculo;
    double valorMatricula;
    fabricante fabricante;
    
    public automotor(String cedula, String marca, int agnoFabricacion, double valorVehiculo, fabricante fabricante){
        this.cedula = cedula;
        this.marca = marca;
        this.agnoFabricacion = agnoFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;

        agnoActual = 2023;

        // El valor de la matricula es igual al 0.002% del valor de vehículo por el número de años de antiguedad del vehiculo.
        this.valorMatricula = 0.002 * this.valorVehiculo * (this.agnoActual - this.agnoFabricacion);
    }

    public automotor(String cedula, String marca, int agnoFabricacion){
        this.cedula = cedula;
        this.marca = marca;
        this.agnoFabricacion = agnoFabricacion;
    }

    public String toString(){
        return "Cédula vehículo: " + cedula + " Marca: " + marca + " Año de fabricación: " + agnoFabricacion + 
        " Valor del vehículo: " + valorVehiculo + " Valor de matrícula:  " + valorMatricula;
    }

}
