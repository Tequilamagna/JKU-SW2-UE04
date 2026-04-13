package item;

/* TODO: Start your homework implementation here */
public abstract class Item {
    public final String name;

    Item(String name) {
        this.name = name;
    }

    public abstract double price();
    public abstract int count();
    public abstract String prefix();

    @Override
    public String toString() {
        return "%s: %s - %.2f Gold".formatted(this.prefix(), this.name, this.price());
    }
}