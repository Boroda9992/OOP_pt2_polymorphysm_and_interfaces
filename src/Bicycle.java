public class Bicycle extends Vehicle implements VehicleService{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {
        System.out.println("Tyre updated!");
    }
}
