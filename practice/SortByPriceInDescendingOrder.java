package comparatorandcomparable.practice;

import java.util.Comparator;

public class SortByPriceInDescendingOrder implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
