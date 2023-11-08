package L09Generics.Exercise.P04CustomList;

import java.util.Collections;

public class Sorter {
    public static <T extends Comparable<T>>  void sort (CustomList<T> list){
        Collections.sort(list.get());
    }
}
