package L09Generics.Lab.P03GenericScale;

public class Scale <T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale (T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if (left.equals(right)){
            return null;
        }

        if (right.compareTo(left) > 0){
            return left;
        }
        return right;
    }
}
