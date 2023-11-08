package L09Generics.Lab.L01JarOfT;

import java.util.ArrayDeque;

public class Jar <T> {
    private ArrayDeque<T> data;

    public Jar (){
        data = new ArrayDeque<>();
    }

    public void add (T element){
        data.push(element);
    }

    public T remove (){
        return data.pop();
    }

}
