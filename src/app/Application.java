package app;

import inout.Out;
import item.Item;
import item.Items;

public class Application {
  public static void main(String[] args) {

    Item uruk = Items.item("Uruk", 1);
    Item steel = Items.item("Steel", 0.5);
    Item work = Items.item("Work", 0.05);
    Item sword = Items.item("Sword", steel, work);
    Item shield = Items.item("Shield", steel, work);
    Item armour = Items.item("Armour", steel, work);
    Item test = null; // testing if CombinedItem.build filters out null Items
    Item fightingUruk = Items.item("Fighting Uruk-Hai", uruk, sword, shield, armour, test);
    Item army = Items.item(fightingUruk, 10000); //but my lord, there is no such force
    Item wizard = Items.item("Wizard", 1000);
    Item whiteWizard = Items.enchant(wizard, "Level-up", "White");
    Item saruman = Items.enchant(whiteWizard, "corrupted by Sauron", "Fallen");
    Item pipeWeed = Items.item("Pipe Weed", 10);
    Item tradedWeed = Items.enchant(pipeWeed, "\"exported\"", "Traded");
    Item exportedWeed = Items.enchant(tradedWeed, "dealt", 20);
    Item drugDealing = Items.item(exportedWeed, 500);
    Item hobbit = Items.item("Hobbit", 200);
    Item oppressedHobbit = Items.enchant(hobbit, "intimidated", "Oppressed");
    Item shireFolk = Items.item(oppressedHobbit,400);
    Item men = Items.item("Man of Bree", 10);
    Item thug = Items.enchant(men, "corrupted by Saruman", "Bad");
    Item thugs = Items.item(thug, 50);

    Item myItem = Items.item("Army worth of Mordor", saruman, army, drugDealing, thugs, shireFolk);

    /* TODO: Call correct functions on myItem */
    Out.println("==========");
    Out.println("%s consists of %d primitive items".formatted(myItem.name, myItem.count()));
    Out.println("Its value is %.2f Gold.".formatted(myItem.value())); // Probably less than Bilbo's Mithril shirt.
    Out.println("It can be bought for %.2f Gold and sold for %.2f Gold".formatted(myItem.buyPrice(), myItem.sellPrice()));
    Out.println("==========");
    Out.println(myItem);
  }
}