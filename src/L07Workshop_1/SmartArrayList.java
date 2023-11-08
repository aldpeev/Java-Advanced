package L07Workshop_1;

import java.util.function.Consumer;

public class SmartArrayList {
    private int[] data;
    private int size = 0;


    public SmartArrayList (){
        data = new int[4];
    }

    public void add(int n){
        data[size++] = n;

        if (size == data.length){
            grow();
        }
    }

    private void grow() {
        int[] biggerArr = new int[data.length * 2];
        System.arraycopy(data, 0, biggerArr, 0, data.length);
        data = biggerArr;
    }

    public int get(int index){
        if (indexIsValid(index)){
            return data[index];
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }

    }

    private boolean indexIsValid(int index) {
        return index >= 0 && index < size;
    }

    public boolean contains(int element){
        for (int el : data) {
            if (element == el){
                return true;
            }
        }
        return false;
    }

    public int remove(int index){
        if(indexIsValid(index)){
            int removed = data[index];
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;

            return removed;
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(data[i]);
        }
    }
}
