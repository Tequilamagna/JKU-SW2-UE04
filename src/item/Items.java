package item;

public class Items {

    public static BasicItem item(String name, double price) {
        return BasicItem.build(name, price);
    }

    public static CombinedItem item(String name, Item ... components) {
        return CombinedItem.build(name, components);
    }

    public static ItemGroup item(Item item, int n) {
        return ItemGroup.build(item, n);
    }

    public static NameSpell enchant(Item item, String spellName, String adjective) {
        return NameSpell.cast(item, spellName, adjective);
    }

    public static PriceSpell enchant(Item item, String spellName, int power) {
        return PriceSpell.cast(item, spellName, power);
    }
}
