package L06DefiningClasses.Exercise.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumptionPer1Km;
    private int distance = 0;

    public Car (String model,double fuelAmount, double fuelConsumptionPer1Km ){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumptionPer1Km = fuelConsumptionPer1Km;
    }

    public double neededFuel (int distance){
        return distance * fuelConsumptionPer1Km;
    }

    public boolean isEnoughFuelToDrive (int distance){
        return neededFuel(distance) <= fuelAmount;
    }

    public void drive (int distance){
        if (isEnoughFuelToDrive(distance)){
            this.distance += distance;
            fuelAmount -= neededFuel(distance);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String toString(){
        return String.format("%s %.2f %d", model, fuelAmount, distance);
    }
}
