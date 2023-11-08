package L06DefiningClasses.Exercise.P05CarSalesmen;

public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    //A Car's weight and color are optional.
    public Car (String model, Engine engine, int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    public Car (String model, Engine engine, int weight){
        this(model, engine, weight, "n/a");
    }

    public Car (String model, Engine engine, String color){
        this(model, engine, -1, color);
    }

    public Car (String model, Engine engine){
        this(model, engine, -1, "n/a");
    }

    public String toString(){
        if (weight == -1){
            return String.format("%s:%n%sWeight: n/a%nColor: %s",model,engine.toString(),color);
        } else {
            return String.format("%s:%n%sWeight: %d%nColor: %s",model,engine.toString(),weight,color);
        }
    }

}
