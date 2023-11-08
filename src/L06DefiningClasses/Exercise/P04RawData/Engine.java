package L06DefiningClasses.Exercise.P04RawData;

public class Engine {
    private int speed;
    private int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public boolean isPowerful(){
        return  power > 250;
    }
}
