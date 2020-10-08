package tareacorta.facade;

import java.util.Arrays;
import java.util.List;

public class facadeVehiculo {

    public Vehiculo on() {

        disponibilidadVehiculo battery = new disponibilidadVehiculo();
        battery.on();

        sistemaTiempo sistemaTiempo = new sistemaTiempo();
        sistemaTiempo.Start();

        SistemasVehiculo gps = new sistemaGPS();
        gps.start();

        SistemasVehiculo usuario = new sistemaUsuario();
        usuario.start();

        List<SistemasVehiculo> sistemasVehiculos = Arrays.asList(gps, usuario);

        Vehiculo vehiculo = new Vehiculo(battery, sistemaTiempo, sistemasVehiculos);

        return vehiculo;
    }

    public void off(Vehiculo vehiculo) {

        for(SistemasVehiculo service : vehiculo.getsistemasVehiculos()) {
            service.close();
        }
        vehiculo.getsistemaTiempo().Close();
        vehiculo.getDisponibilidadVehiculo().off();
    }

}
