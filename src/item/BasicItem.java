package item;

public class BasicItem extends Item{
    private final double price;

    private BasicItem(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public String prefix() {
        return "Basic";
    }

    public static BasicItem build(String name, double price) {
        if(name == null || name.isBlank() || price < 0) {
            return null;
        }

        return new BasicItem(name, price);
    }
}
