package L09Generics.Exercise.P03CountMethod;

import java.util.ArrayList;
import java.util.List;

public class BoxCount<T extends Comparable<T>> {
    private List<T> data;

    public BoxCount() {
        data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public int countGreater(T element) {
        return (int) data.stream().filter(e -> e.compareTo(element) > 0).count();
    }
}


