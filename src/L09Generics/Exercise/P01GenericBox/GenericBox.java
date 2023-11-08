package L09Generics.Exercise.P01GenericBox;

public class GenericBox <T> {
    private T data;

    public GenericBox(T data) {
        this.data = data;
    }

    public String toString (){
        //"{class full name}: {value}".
        return data.getClass().getName() + ": " + data;
    }
}
