/**
 *  Класс, описывающий обслуживание седана, на нашей станции обслуживания.
 *  Реализует из интерфейса VehicleService методы:
 *   updateTyres()
 *   checkEngine()
 */
public class Car extends Vehicle implements VehicleService {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {System.out.println("[" + getModelName() + "] " + getWheelsCount() + " Tyres updated!");}

    @Override
    public void checkEngine() {System.out.println("[" + getModelName() + "] Engine checked!");}
}
