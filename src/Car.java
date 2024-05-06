/**
 * Класс автомобилей, наследующийся от Vehicle.
 * Реализует: ServiceEngine, ServiceTyres
 * Перегружает: checkEngine(), updateTyres()
 */
public class Car extends Vehicle implements ServiceEngine, ServiceTyres {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
        System.out.println("Car tyre " + (i + 1) + " updated!");
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Car engine checked!");
    }
}
