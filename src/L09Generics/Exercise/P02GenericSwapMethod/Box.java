package L09Generics.Exercise.P02GenericSwapMethod;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private T data;

    public Box (T data){
       this.data = data;
    }

    public String toString (){
        return String.format("%s: %s%n", data.getClass().getName(), data);
    }
}
