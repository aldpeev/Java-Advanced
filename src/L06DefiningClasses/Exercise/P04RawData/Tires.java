package L06DefiningClasses.Exercise.P04RawData;

import java.util.ArrayList;
import java.util.List;

public class Tires {
    private List<Tire> tires;

    public Tires() {
        this.tires = new ArrayList<>();
    }

    public void addTire (Tire tire){
        tires.add(tire);
    }

    public boolean isOneOrMoreUnderPressured(){
        for (Tire tire : tires) {
            if (tire.isUnderPressured()){
                return true;
            }
        }
        return false;
    }
}
