public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle";
    }

    @Override
    public void check() {
        updateTyres();
    }
}
