package oointro;
import java.util.Scanner;

import oointro.Loot;
import oointro.Loot.lootType;

public class Runner {
    /**
  * Main Class 
  * @param args
  */
  public static void main(String[] args) {
    DungeonLoot dungeonLoot = new DungeonLoot();

    System.out.println("Adding Bayonnet.");
    Loot newLoot = new Loot();
    newLoot.setName("Bayonnet");
    newLoot.setDescription("Slick and pointy.");
    newLoot.setType("weapon");
    dungeonLoot.addLoot(newLoot);

    System.out.println("Adding Diving Suit.");
    Loot newLoot2 = new Loot();
    newLoot2.setName("Diving Suit");
    newLoot2.setDescription("Wet, spongy, not very effective for battle.");
    newLoot2.setType("armour");
    dungeonLoot.addLoot(newLoot2);

    System.out.println("Adding Celtic Ring.");
    Loot newLoot3 = new Loot();
    newLoot3.setName("Celtic Ring");
    newLoot3.setDescription("Ancient bling.");
    newLoot3.setType("jewellery");
    dungeonLoot.addLoot(newLoot3);

    System.out.println("Adding Celtic Ring. (again)");
    Loot newLoot4 = new Loot();
    newLoot4.setName("Celtic Ring");
    newLoot4.setDescription("Ancient bling.");
    newLoot4.setType("jewellery");
    dungeonLoot.addLoot(newLoot4);

    System.out.println("Printing sorted list of loot.\n");
    dungeonLoot.printSortedLoot();
    System.out.println();

    System.out.println("Removing Bayonnet.");
    String name = "Bayonnet";
    dungeonLoot.removeLoot(name);
    
    System.out.println("Printing sorted list of loot.\n");
    dungeonLoot.printSortedLoot();
  }
}
