package L09Generics.Exercise.P04CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> data;

    public CustomList (){
        data = new ArrayList<>();
    }

    public void add(T el){
        data.add(el);
    }

    public T remove(int index){
        return data.remove(index);
    }

    public boolean contains (T el){
        return data.contains(el);
    }

    public void swap (int index1, int index2){
        Collections.swap(data, index1, index2);
    }

    public int countGreaterThan (T el){
        return (int) data.stream().filter(e -> e.compareTo(el) > 0).count();
    }

    public T getMax(){
        return Collections.max(data);
    }

    public T getMin(){
        return Collections.min(data);
    }

    public List<T> get(){
        return data;
    }

    public String toString (){

        StringBuilder sb = new StringBuilder();
        for (T el : data) {
            sb.append(String.format("%s%n", el));
        }
        return sb.toString();
    }
}
