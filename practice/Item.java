package comparatorandcomparable.practice;

public class Item {
    private String category;
    private String name;
    private double price;

    public Item(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Item{" + "category='" + category + '\''
                + "name='" + name + '\'' + "price='" + price + '\'' + '}';
    }
}
