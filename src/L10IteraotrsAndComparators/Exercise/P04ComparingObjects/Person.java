package L10IteraotrsAndComparators.Exercise.P04ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person another) {
        int result = 0;

        result = getName().compareTo(another.getName());

        if (result == 0){
            result =  getAge() - another.getAge();
        }

        if (result == 0){
            result = getTown().compareTo(another.getTown());
        }

        return result;
    }
}
