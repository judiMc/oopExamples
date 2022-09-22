package oointro;
import java.util.ArrayList;

public class LootList {
    ArrayList <Loot> storeLoot = new ArrayList <Loot> ();

    //methods
    public void addLoot(Loot newLoot){
        storeLoot.add(newLoot);
    }

    public void removeLoot(Loot removeLoot){
        storeLoot.remove(removeLoot);
    }

    public Loot searchLoot(String nameSearch){
        Loot lootSearch = new Loot();

        if (storeLoot.size() == 0) {
            return null;
        }

        for (int i = 0; i < storeLoot.size(); i++) {
            lootSearch = storeLoot.get(i);
            if (lootSearch.getName().equalsIgnoreCase(nameSearch)) {
                return lootSearch;
            } 
        }
        return null;
    }
}
