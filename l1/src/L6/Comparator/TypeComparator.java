package L6.Comparator;

import L6.Classes.Category;

import java.util.Comparator;

public class TypeComparator implements Comparator<Category> {
    @Override
    public int compare(Category o1, Category o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
