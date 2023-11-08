package L06DefiningClasses.Exercise.P04RawData;

public class Car {
    private String model;
    private Engine engine;
    private Tires tires;
    private Cargo cargo;

    public Car (String model, Engine engine, Tires tires, Cargo cargo){
        this.model = model;
        this.engine = engine;
        this.tires = tires;
        this.cargo = cargo;
    }

    public boolean isFlamableType(){
        return cargo.getType().equals("flamable") && engine.isPowerful();
    }

    public boolean isFragileType(){
        return cargo.getType().equals("fragile") && tires.isOneOrMoreUnderPressured();
    }

    public String getModel() {
        return model;
    }
}
