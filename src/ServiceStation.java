public class ServiceStation implements VehicleService {
    public void check(Vehicle vehicle) {

        if (vehicle.getWheelsCount() == 4) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) vehicle.updateTyres();
            vehicle.checkEngine();
            System.out.println();

        } else if (vehicle.getWheelsCount() >= 6) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) vehicle.updateTyres();
            vehicle.checkEngine();
            vehicle.checkTrailer();
            System.out.println();

        } else if (vehicle.getWheelsCount() == 2) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) vehicle.updateTyres();
            System.out.println();
        }

    }
}
