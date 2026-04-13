package item;

public class PriceSpell extends SpellItem {
    private static final double POWER_FACTOR = 0.1;
    private final int power;

    private PriceSpell(Item inner, String spellName, int power) {
        super(inner, spellName, inner.name);
        this.power = power;
    }

    @Override
    public double price() {
        return inner.price() * (1 + power * POWER_FACTOR);
    }

    @Override
    public String spellInfo() {
        return "(%s with power %d)".formatted(spellName, power);
    }

    public static PriceSpell cast(Item inner, String spellName, int power) {
        if(inner == null || spellName == null || spellName.isBlank() || power < 0) {
            return null;
        }

        return new PriceSpell(inner, spellName, power);
    }
}
