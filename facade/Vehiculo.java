package tareacorta.facade;

import java.util.List;

public class Vehiculo {

    private final disponibilidadVehiculo disponibilidadVehiculo;
    private final sistemaTiempo sistemaTiempo;
    private final List<SistemasVehiculo> sistemasVehiculos;

    public Vehiculo(disponibilidadVehiculo disponibilidadVehiculo, sistemaTiempo sistemaTiempo, List<SistemasVehiculo> sistemasVehiculos) {
        this.disponibilidadVehiculo = disponibilidadVehiculo;
        this.sistemaTiempo = sistemaTiempo;
        this.sistemasVehiculos = sistemasVehiculos;
    }

    public sistemaTiempo getsistemaTiempo() {
        return sistemaTiempo;
    }

    public disponibilidadVehiculo getDisponibilidadVehiculo() {
        return disponibilidadVehiculo;
    }

    public List<SistemasVehiculo> getsistemasVehiculos() {
        return sistemasVehiculos;
    }
}
