package oointro;
import java.util.Scanner;

import oointro.Loot;
import oointro.LootLookUp;
import oointro.Loot.lootType;

public class Runner {
    /**
  * Main Class 
  * @param args
  */
  public static void main(String[] args) {
    LootLookUp lootInfoLookup = new LootLookUp();

    System.out.println("Adding Gold.");
    Loot newLoot = new Loot();
    newLoot.setName("Gold");
    newLoot.setDescription("Shiny and rare.");
    newLoot.setType("jewellery");
    lootInfoLookup.addLoot(newLoot);

    System.out.println("Adding Healing.");
    Loot newLoot2 = new Loot();
    newLoot2.setName("Healing");
    newLoot2.setDescription("Heals yours character.");
    newLoot2.setType("potion");
    lootInfoLookup.addLoot(newLoot2);

    System.out.println("Removing Healing.");
    String name = "Healing";
    String description = "Heals yours character.";
    lootInfoLookup.removeLoot(name, description);
    
    System.out.println("Searching for Gold by name.");
    String nameSearch = "Gold";
    Loot foundLoot = lootInfoLookup.searchLoot(nameSearch);
    System.out.println("Found:");
    System.out.println(foundLoot.toString());

    System.out.println("Searching for Gold by description.");
    String nameSearch2 = "Shiny and rare.";
    Loot foundLoot2 = lootInfoLookup.searchLoot(nameSearch2);
    System.out.println("Found:");
    System.out.println(foundLoot2.toString());
  }
}
