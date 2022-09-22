package oointro;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {
    LootList allTheLoot = new LootList();

    System.out.println("Adding Gold.");
    Loot newLoot = new Loot();
    newLoot.setName("Gold");
    newLoot.setDescription("Shiny and rare");
    newLoot.setType("jewellery");
    allTheLoot.addLoot(newLoot);

    System.out.println("Adding Healing.");
    Loot newLoot2 = new Loot();
    newLoot2.setName("Healing");
    newLoot2.setDescription("Heals yours character.");
    newLoot2.setType("potion");
    allTheLoot.addLoot(newLoot2);

    System.out.println("Removing Healing.");
    Loot removeLoot = new Loot();
    removeLoot.setName("Healing");
    removeLoot.setDescription("Heals yours character.");
    removeLoot.setType("potion");
    allTheLoot.removeLoot(removeLoot);
    
    System.out.println("Searching for Gold.");
    String nameSearch = "Gold";
    Loot foundLoot = allTheLoot.searchLoot(nameSearch);
    System.out.println("Found:");
    System.out.println(foundLoot.toString()); 
  }
}
