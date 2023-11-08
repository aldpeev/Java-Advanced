package L07Workshop_1;

public class Main {
    public static void main(String[] args) {

        SmartArrayList testArr = new SmartArrayList();

        testArr.add(5);
        testArr.add(5);
        testArr.add(5);
        testArr.add(5);
        testArr.add(5);
        testArr.add(5);

        System.out.println(testArr.contains(4));


        System.out.println(testArr.remove(2));
        System.out.println(testArr.get(4));

        testArr.forEach(System.out::println);

    }
}
