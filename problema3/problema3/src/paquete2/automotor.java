package paquete2;

public class automotor {
    String cedula;
    String marca;
    int agnoFabricacion;
    int agnoActual;
    double valorVehiculo;
    double valorMatricula;
    
    public automotor(String cedula, String marca, int agnoFabricacion, double valorVehiculo){
        this.cedula = cedula;
        this.marca = marca;
        this.agnoFabricacion = agnoFabricacion;
        this.valorVehiculo = valorVehiculo;

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
