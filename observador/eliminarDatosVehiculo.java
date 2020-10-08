package tareacorta.observador;

public class eliminarDatosVehiculo implements observador{

    public eliminarDatosVehiculo(){}

    @Override
    public void update() {
        System.out.println("Se ha elimando los datos del vehiculo");
    }
}
