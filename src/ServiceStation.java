public class ServiceStation implements VehicleService {
    /**
     * Общий метод для любого вида транспорта. Применяет все методы интерфейса VehicleService.
     * Будет полезен в том случае, если для нас нет разницы, что именно мы обслуживаем, а мы просто реализуем набор методов - инструментов в нашей мастерской.
     * Подход плох тем, что в реальной жизни сменить покрышки на велосипеде и на грузовике - это две разных замены покрышек, за разную стоимость, требующую разного набора инструментов и т.д.
     * Со временем, это приведет к тому, что у нас будет один метод-свалка check, перебирающий все доступные нам операции над транспортным средством, только ради того, чтобы выполнить одну-две.
     * @param vehicle - абстрактный родительский класс, присущий любому транспортному средству, с которым работает программа.
     */
    public void check(Vehicle vehicle) {
        vehicle.updateTyres();
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }

    /**
     * Специализированный метод для обслуживания велосипедов.
     * Может быть полезен, если у нас появятся разные типы велосипедов, скидка для велосипедистов, появится необходимость выгружать бухгалтерскую отчетность по видам транспорта (потому что там налог, нарпимер, разный) и т.д.
     * Перебирает все операции, которые мы можем проводить над велосипедом.
     * @param bicycle - объект класса Bicycle, потомка Vehicle
     */
    public void checkBicycle (Bicycle bicycle){
        bicycle.updateTyres();
    }

    /**
     * Специализированный метод для обслуживания седанов.
     * Перебирает все операции, которые мы можем проводить над седаном.
     * @param car - объект класса Car, потомка Vehicle
     */
    public void checkCar (Car car){
        car.updateTyres();
        car.checkEngine();
    }

    /**
     * Специализированный метод для обслуживания пикапов.
     * Перебирает все операции, которые мы можем проводить над пикапом.
     * @param truck - объект класса Truck, потомка Vehicle
     */
    public void checkTruck (Truck truck){
        truck.updateTyres();
        truck.checkEngine();
        truck.checkTrailer();
    }
}
