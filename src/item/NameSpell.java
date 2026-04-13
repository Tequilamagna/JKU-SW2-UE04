package item;

public class NameSpell extends SpellItem {

    private NameSpell(Item inner, String spellName, String adjective) {
        super(inner, spellName, adjective + inner.name);
    }

    @Override
    public double price() {
        return inner.price();
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public String spellInfo() {
        return "(" + this.spellName + ")";
    }
}
