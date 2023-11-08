package L10IteraotrsAndComparators.Exercise.P05StartegyPattern;

import java.util.Comparator;
import java.util.Locale;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person f, Person s) {
        int result = 0;

        result = f.getName().length() - s.getName().length();

        if (result == 0){
            result = f.getName().toLowerCase(Locale.ROOT).charAt(0) - s.getName().toLowerCase(Locale.ROOT).charAt(0);
        }

        return result;
    }
}
