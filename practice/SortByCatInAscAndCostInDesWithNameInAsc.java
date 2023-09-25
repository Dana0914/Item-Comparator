package comparatorandcomparable.practice;

import java.util.Comparator;


public class SortByCatInAscAndCostInDesWithNameInAsc implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int compareCategory = o1.getCategory().compareTo(o2.getCategory());
        if (compareCategory == 0) {
            int priceComparison = Double.compare(o2.getPrice(), o1.getPrice());
            if (priceComparison == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return priceComparison;
        }
        return compareCategory;
    }
}
