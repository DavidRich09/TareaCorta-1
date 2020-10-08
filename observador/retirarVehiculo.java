package tareacorta.observador;

import java.util.ArrayList;

public class retirarVehiculo implements ObjetoObservado{

    private ArrayList<observador> observadores;

    public retirarVehiculo(){
        observadores = new ArrayList<observador>();
    }

    public void enlazarObservador(observador o){
        observadores.add(o);
    }

    @Override
    public void notificar() {
        for(observador o:observadores){ o.update();}
    }

    public void eliminarVehiculo(){
        notificar();
    }
}
