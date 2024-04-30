/**
 * Класс, описывающий обслуживание велосипеда, на нашей станции обслуживания.
 * Реализует из интерфейса VehicleService метод
 * updateTyres()
 */
public class Bicycle extends Vehicle implements VehicleService {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {
        System.out.println("[" + getModelName() + "] " + getWheelsCount() + " Tyres updated!");
    }
}
