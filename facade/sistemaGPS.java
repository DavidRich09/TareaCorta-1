package tareacorta.facade;

public class sistemaGPS implements SistemasVehiculo {
    @Override
    public void start() {
        System.out.println("El servicio GPS ha iniciado");
    }

    @Override
    public void close() {
        System.out.println("El servicio GPS ha terminado");
    }
}
