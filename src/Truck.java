public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Truck";
    }

    @Override
    public void check() {
        updateTyres();
        checkEngine();
        checkTrailer();
    }
}
