package L10IteraotrsAndComparators.Exercise.P03Froggy;

import java.util.Iterator;

public class Lake implements Iterable<String> {
    private String[] data;

    public Lake (String... data){
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                String result = data[index];
                index += 2;

                if (!hasNext() && index % 2 == 0){
                    index = 1;
                }

                return result;
            }
        };
    }
}
