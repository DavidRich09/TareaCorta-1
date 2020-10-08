package tareacorta.observador;

public class vehiculoUsuario implements observador{
    public vehiculoUsuario(){}
    @Override
    public void update() {
        System.out.println("El vehiculo se ha elimado del usuario");
    }
}
