package item;

import static app.Helper.indentEachLine;

public class ItemGroup extends Item {
    private final Item wrapped;
    private final int amount;

    private ItemGroup(Item item, int amount) {
        super("%d x %s".formatted(amount, item.toString()));
        this.wrapped = item;
        this.amount = amount;
    }

    @Override
    public double price() {
        return wrapped.price() * amount;
    }

    @Override
    public int count() {
        return wrapped.count() * amount;
    }

    @Override
    public String prefix() {
        return "Multi";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + indentEachLine(wrapped.toString());
    }

    public static ItemGroup build(Item item, int amount) {
        if(item == null || amount <= 0) {
            return null;
        }

        return new ItemGroup(item, amount);
    }
}
