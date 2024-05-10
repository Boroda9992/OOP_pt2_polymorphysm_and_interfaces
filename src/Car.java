public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public void check() {
        updateTyres();
        checkEngine();
    }
}
