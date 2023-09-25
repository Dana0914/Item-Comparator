package comparatorandcomparable.practice;

import java.util.Comparator;

public class SortByCategoryInAscAndByCostInDes implements Comparator <Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int compareCategory = o1.getCategory().compareTo(o2.getCategory());
        if (compareCategory == 0) {
            return Double.compare(o2.getPrice(), o1.getPrice());
        } else {
            return compareCategory;
        }
    }
}
