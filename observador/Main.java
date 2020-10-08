package tareacorta.observador;

public class Main {

    public static void main(String[] args) {

        retirarVehiculo Controlador = new retirarVehiculo();
        eliminarDatosVehiculo EDV = new eliminarDatosVehiculo();
        disponibilidadVehiculo DV = new disponibilidadVehiculo();
        vehiculoUsuario VU = new vehiculoUsuario();

        Controlador.enlazarObservador(EDV);
        Controlador.enlazarObservador(DV);
        Controlador.enlazarObservador(VU);

        Controlador.eliminarVehiculo();

    }
}
