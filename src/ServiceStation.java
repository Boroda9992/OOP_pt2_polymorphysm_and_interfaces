public class ServiceStation {
    public void service(Vehicle vehicle) {
        System.out.println();
        System.out.printf("Now servicing: %s | Model: %s ...",
                vehicle.toString(),
                vehicle.getModelName());
        System.out.println();
        vehicle.check();
        System.out.printf("Complete servicing: %s | Model: %s !!!",
                vehicle,
                vehicle.getModelName());
        System.out.println();
    }
}
