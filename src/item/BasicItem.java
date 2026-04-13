package item;

public class BasicItem extends Item{
    private final double price;

    private BasicItem(String name, double price) {
        super(name);
        this.price = price;
    }

    public double price() {
        return this.price;
    }

    public int count() {
        return 1;
    }

    public String prefix() {
        return "Basic";
    }

    public static BasicItem build(String name, double price) {
        return new BasicItem(name, price);
    }
}
