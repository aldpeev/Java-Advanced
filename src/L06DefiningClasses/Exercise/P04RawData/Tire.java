package L06DefiningClasses.Exercise.P04RawData;

public class Tire {
    private double pressure;
    private int age;


    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public boolean isUnderPressured (){
        return pressure < 1;
    }
}
