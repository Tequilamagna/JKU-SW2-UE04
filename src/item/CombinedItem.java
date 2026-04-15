package item;

import static app.Helper.indentEachLine;

public class CombinedItem extends Item {
    private static final double COMBINATION_SURCHARGE = 1.1;
    Item[] components;

    private CombinedItem(String name, Item ... components){
        super(name);
        this.components = components;
    }

    @Override
    public double price() {
        double price = 0;
        for(Item item : components) {
            price += item.price();
        }
        return price * COMBINATION_SURCHARGE;
    }

    @Override
    public int count() {
        int nItems = 0;
        for(Item item : components) {
            nItems += item.count();
        }
        return nItems;
    }

    @Override
    public String prefix() {
        return "Combined";
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString() + "\n");
        StringBuilder indent = new StringBuilder();
        for(Item item : components) {
            indent.append(item.toString()).append("\n");
        }
        result.append(indentEachLine(indent.toString()));
        return result.toString();
    }

    public static CombinedItem build(String name, Item ... components) {
        if(name == null || name.isBlank() || components == null || components.length < 2){
            return null;
        }

        int nValid = 0;
        for(Item component : components) { //check for null entries
            if (component == null) {
                continue;
            }
            nValid++;
        }

        if(nValid == components.length) {
            return new CombinedItem(name, components);
        }

        Item[] validComp = new Item[nValid];
        int j = 0;
        for (Item component : components) {
            if (component == null) {
                continue;
            }
            validComp[j] = component;
            j++;
        }

        return new CombinedItem(name, validComp);
    }
}
