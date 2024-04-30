/**
 *  Класс, описывающий обслуживание пикапа, на нашей станции обслуживания.
 *  Реализует из интерфейса VehicleService методы:
 *   updateTyres()
 *   checkEngine()
 *   checkTrailer()
 */
public class Truck extends Vehicle implements VehicleService{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyres() {System.out.println("[" + getModelName() + "] " + getWheelsCount() + " Tyres updated!");}

    @Override
    public void checkEngine() {System.out.println("[" + getModelName() + "] Engine checked!");}

    @Override
    public void checkTrailer() {System.out.println("[" + getModelName() + "] Trailer checked!");}
}
