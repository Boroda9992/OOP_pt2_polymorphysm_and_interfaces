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

    public abstract void check();

    @Override
    public void updateTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            String className = this.toString();
            int currentWheel = 1 + i;
            System.out.printf("%s tyre %d updated!",
                    className,
                    currentWheel);
            System.out.print("__$$$__");
        }
        System.out.println();
    }

    @Override
    public void checkEngine() {
        String className = this.toString();
        System.out.printf("%s engine checked!",
                className);
        System.out.println();
    }

    @Override
    public void checkTrailer() {
        String className = this.toString();
        System.out.printf("%s trailer checked!",
                className);
        System.out.println();
    }
}
