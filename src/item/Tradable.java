package item;

public interface Tradable {
    double RIPOFF = 0.3;

    default double buyPrice() {
        return value() * (1 + RIPOFF);
    }

    default double sellPrice() {
        return value() * (1 - RIPOFF);
    }

    abstract double value();
}
