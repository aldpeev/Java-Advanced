package L10IteraotrsAndComparators.Lab.P01Book;

import java.util.Comparator;

public class BookComparator implements Comparator <Book> {
    @Override
    public int compare(Book f, Book s) {
        int result = 0;

        result = f.getTitle().compareTo(s.getTitle());

        if (result == 0){
           result = f.getYear() - s.getYear();
        }

        return result;
    }
}
