public class Car extends Vehicle implements VehicleService {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Car{}" + getModelName();
    }

    @Override
    public void updateTyres() {
        System.out.println("Tyre updated!");
    }

    @Override
    public void checkEngine() {
        System.out.println("Engine checked!");
    }
}
