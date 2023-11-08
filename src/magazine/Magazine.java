package magazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Magazine {
    private List<Cloth> data;
    private String type;
    private int capacity;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void addCloth(Cloth cloth){
        if (data.size() < capacity){
            data.add(cloth);
        }
    }

    public boolean removeCloth(String color){
        boolean removed = false;
        for (int i = data.size() - 1; i >= 0; i--) {
            if (data.get(i).getColor().equals(color)) {
                data.remove(i);
                removed = true;
            }
        }
        return removed;
    }

    public Cloth getSmallestCloth(){
        Cloth smallest = data.get(0);
        for (Cloth cloth : data) {
            if (cloth.getSize() < smallest.getSize()) {
                smallest = cloth;
            }
        }
        return smallest;
    }

    public Cloth getCloth(String color){
        Cloth searchedCloth = null;

        for (Cloth cloth : data) {
            if (cloth.getColor().equals(color)){
               searchedCloth = cloth;
            }
        }
        return searchedCloth;
    }

    public int getCount(){
        return data.size();
    }

    public String report(){
//        o	"{type} magazine contains:
//        {Cloth1}
//        {Cloth2}
//        (…)"

        StringBuilder sb = new StringBuilder();
        sb.append(type).append(" magazine contains:\n");
        for (Cloth cloth : data) {
            sb.append(cloth.toString()).append("\n");
        }
        return sb.toString();
    }


}
