package oointro;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class LootComparator implements Comparator<Loot> {
    @Override
    public int compare(Loot l1, Loot l2) {
        return l1.getName().compareTo(l2.getName());
    }
}

public class DungeonLoot {
    HashSet<Loot> storeLoot = new HashSet<>();

    //methods
    public void addLoot(Loot newLoot){
        storeLoot.add(newLoot);
    }

    public void removeLoot(String name){
        // Option 1: Iterate with for loop to find item, then use remove method
        List<Loot> allItems = new ArrayList<>(storeLoot);
        Loot itemToRemove = null;

        for (Loot item : allItems) {
            if (item.getName() == name) {
                itemToRemove = item;
                break;
            }
        }
        
        if (itemToRemove != null) {
            storeLoot.remove(itemToRemove);
        }

        // Option 2: Pass a lambda function to the removeIf method that runs on all
        //           items of the list.
        //           Items will be removed from the list when the function returns true.
        //
        // storeLoot.removeIf(loot -> loot.getName() == name);
    }

    public void printSortedLoot(){
        List<Loot> lootList = new ArrayList<>(storeLoot);

        Collections.sort(lootList, new LootComparator());

        for (Loot l : lootList) {
            System.out.println(l.toString());
        }
    }
}
