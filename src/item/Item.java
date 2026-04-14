package item;

public abstract class Item implements Tradable{
    public final String name;

    protected Item(String name) {
        this.name = name;
    }

    public abstract double price();
    public abstract int count();
    public abstract String prefix();

    public double value() {
        return this.price();
    }

    @Override
    public String toString() {
        return "%s: %s - %.2f Gold".formatted(this.prefix(), this.name, this.price());
    }
}