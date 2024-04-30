/**
 * Абстрактный родительский класс, присущий любому транспортному средству, с которым работает программа.
 * Содержит параметры (String) modelName и (int) wheelsCount
 * Доступ к переменным через геттеры\сеттеры
 */
public abstract class Vehicle implements VehicleService {
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
