/**
 * Класс грузовиков, наследующийся от Vehicle.
 * Реализует: ServiceTrailer, ServiceEngine, ServiceTyres
 * Перегружает: checkTrailer(), checkEngine(), updateTyres()
 */
public class Truck extends Vehicle implements ServiceTrailer, ServiceEngine, ServiceTyres{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Truck tyre " + (i + 1) + " updated!");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Truck engine checked!");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Truck trailer checked!");
    }
}
