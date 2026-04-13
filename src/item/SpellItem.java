package item;

import static app.Helper.indentEachLine;

public abstract class SpellItem extends Item {
    private final Item inner;
    private final String spellName;

    SpellItem(Item inner, String spellName, String newItemName) {
        super(newItemName);
        this.inner = inner;
        this.spellName = spellName;
    }

    public abstract String spellInfo();

    @Override
    public int count() {
        return inner.count();
    }

    @Override
    public String prefix() {
        return "Spell";
    }

    @Override
    public String toString() {
        return super.toString() + spellInfo() + "\n" + indentEachLine(inner.toString());
    }
}
