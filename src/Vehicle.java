/**
 * Абстрактный класс транспортного средства.
 * Поля: String modelName; int wheelsCount.
 * Реализует интерфейсы: ServiceTyres, ServiceEngine, ServiceTrailer
 */
public abstract class Vehicle implements ServiceTyres, ServiceEngine, ServiceTrailer {
        private String modelName;
        private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

}
