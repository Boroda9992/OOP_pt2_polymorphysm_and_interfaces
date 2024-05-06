/**
 * Класс велосипедов, наследующийся от Vehicle.
 * Реализует: ServiceTyres
 * Перегружает: updateTyres()
 */
public class Bicycle extends Vehicle implements ServiceTyres {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Bicycle tyre " + (i + 1) + " updated!");
        }
    }

}
