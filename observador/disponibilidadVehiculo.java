package tareacorta.observador;

public class disponibilidadVehiculo implements observador{
    public disponibilidadVehiculo(){}
    @Override
    public void update() {
        System.out.println("El vehiculo ya no se encuentra disponible");
    }
}
