package L09Generics.Lab.P03GenericScale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> integerScale = new Scale<>(5,5);

        System.out.println(integerScale.getHeavier());

        Scale<String> stringScale = new Scale<>("Anton", "Anton");

        System.out.println(stringScale.getHeavier());
    }
}
