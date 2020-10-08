package tareacorta.facade;

public class sistemaUsuario implements SistemasVehiculo {
    @Override
    public void start() {
        System.out.println("El usuario ha empezado el servicio");
    }

    @Override
    public void close() {
        System.out.println("El usuario a terminado el servicio");
    }
}
