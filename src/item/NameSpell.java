package item;

public class NameSpell extends SpellItem {

    private NameSpell(Item inner, String spellName, String adjective) {
        super(inner, spellName, "%s %s".formatted(adjective, inner.name));
    }

    @Override
    public double price() {
        return inner.price();
    }

    @Override
    public String spellInfo() {
        return "(" + this.spellName + ")";
    }

    public static NameSpell cast(Item inner, String spellName, String adjective) {
        if(inner == null || spellName == null || spellName.isBlank() || adjective == null || adjective.isBlank()){
            return null;
        }

        return new NameSpell(inner, spellName, adjective);
    }
}
