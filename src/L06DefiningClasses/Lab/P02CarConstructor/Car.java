package L06DefiningClasses.Lab.P02CarConstructor;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car(String brand, String model, int horsepower){
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public Car(String brand){
        this(brand, "unknown", -1);
    }

    public String toString (){
        return String.format("The car is: %s %s - %d HP.", brand, model, horsepower );
    }
}
