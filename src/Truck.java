public class Truck extends Vehicle implements VehicleService{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Engine checked!");
    }

    @Override
    public void updateTyres() {
        System.out.println("Tyre updated!");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Trailer checked!");
    }
}
