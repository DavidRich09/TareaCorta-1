package tareacorta.facade;

public class Main {
    public static void main(String[] args) {

        facadeVehiculo facade = new facadeVehiculo();

        System.out.println("=====================");

        Vehiculo vehiculo = facade.on();

        System.out.println("=====================");
        System.out.println("Después de 5 días");
        System.out.println("=====================");

        facade.off(vehiculo);

        System.out.println("=====================");

    }
}
