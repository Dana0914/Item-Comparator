package comparatorandcomparable.practice;

import java.util.ArrayList;
import java.util.List;
// 1) Сортировка по стоимости товаров в порядке убывания.
//  2) Сортировка по категориям в порядке возрастания, при одинаковых
//  категориях необходимо сортировать по стоимости в порядке убывания.
//  3) Сортировка по категориям в порядке возрастания, при одинаковых
//  категориях необходимо сортировать по стоимости в порядке убывания,
//  если стоимость товаров так же идентичная, сортировать по названия
//  товара в порядке возрастания
public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("laptops", "acer", 350_000));
        itemList.add(new Item("tv", "samsung", 200_000));
        itemList.add(new Item("laptops", "lenovo", 350_000));
        itemList.add(new Item("smartphones", "huawei", 125_000));

        itemList.sort(new SortByPriceInDescendingOrder());
        for (Item item : itemList) {
            System.out.println(item);
        }
        System.out.println();
        itemList.sort(new SortByCategoryInAscAndByCostInDes());
        for (Item item : itemList) {
            System.out.println(item);
        }
        System.out.println();
        itemList.sort(new SortByCatInAscAndCostInDesWithNameInAsc());
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}
