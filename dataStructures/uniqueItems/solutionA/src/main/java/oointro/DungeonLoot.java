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
        storeLoot.removeIf(loot -> loot.getName() == name);
    }

    public void printSortedLoot(){
        List<Loot> lootList = new ArrayList<>(storeLoot);

        Collections.sort(lootList, new LootComparator());

        for (Loot l : lootList) {
            System.out.println(l.toString());
        }
    }
}
