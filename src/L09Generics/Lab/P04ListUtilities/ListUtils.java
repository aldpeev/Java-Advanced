package L09Generics.Lab.P04ListUtilities;

import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list){
        ensureNotEmpty(list);
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }

        return min;
    }

    private static <T> void ensureNotEmpty(List<T> list) {
        if (list.isEmpty()){
            throw new IllegalArgumentException("can't be empty");
        }
    }


    public static <T extends Comparable<T>> T getMax(List<T> list){
        ensureNotEmpty(list);
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        }
        return max;
    }

}
