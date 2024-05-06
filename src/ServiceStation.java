/**
 * Класс сервисной станции - для методов, применяемых непосредственно к объектам-наследникам Vehicle.
 * Реализует: ServiceTrailer, ServiceEngine, ServiceTyres
 */
public class ServiceStation implements ServiceTyres, ServiceEngine, ServiceTrailer {

    /**
     * Метод проверяет транспортное средство и применяет к нему методы, в зависимости от его класса.
     * @param vehicle - принимает в качестве параметра объект класса-наследника Vehicle.
     */
    public void check(Vehicle vehicle) {
//        if (vehicle.getClass() == Bicycle.class) {
//            vehicle.updateTyres();
//        } else if (vehicle.getClass() == Car.class) {
//            vehicle.updateTyres();
//            vehicle.checkEngine();
//        } else if (vehicle.getClass() == Truck.class) {
//            vehicle.updateTyres();
//            vehicle.checkEngine();
//            vehicle.checkTrailer();
//        } else {
//            throw new RuntimeException("Vehicle type is unknown!");
//        }

        String vehicleClassName = String.valueOf(vehicle.getClass());
        switch (vehicleClassName){
            case "class Bicycle":
                vehicle.updateTyres();
                break;
            case "class Car":
                vehicle.updateTyres();
                vehicle.checkEngine();
                break;
            case "class Truck":
                vehicle.updateTyres();
                vehicle.checkEngine();
                vehicle.checkTrailer();
                break;
        }

    }

}
