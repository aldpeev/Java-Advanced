package L10IteraotrsAndComparators.Exercise.P02StackIterator;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Stack implements Iterable<Integer> {
    private ArrayDeque<Integer> data;

    public Stack(ArrayDeque<Integer> data) {
        this.data = data;
    }

    public void pop() {
        if (!isEmpty()){
            data.pop();
        } else{
            System.out.println("No elements");
        }

    }

    public boolean isEmpty (){
        return data.isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            ArrayDeque<Integer> copyOfData = data.clone();

            @Override
            public boolean hasNext() {
                return !copyOfData.isEmpty();
            }

            @Override
            public Integer next() {
                return copyOfData.pop();
            }
        };
    }
}
