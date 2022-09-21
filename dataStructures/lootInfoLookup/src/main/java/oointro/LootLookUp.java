package oointro;
import java.util.HashMap;

public class LootLookUp {
    HashMap <String, Loot> storeLoot = new HashMap<>();

    //methods
    public void addLoot(Loot newLoot){
        storeLoot.put(newLoot.getName(), newLoot);
        storeLoot.put(newLoot.getDescription(), newLoot);
    }

    public void removeLoot(String name, String description){
        storeLoot.remove(name);
        storeLoot.remove(description);
    }

    public Loot searchLoot(String keySearch){
        Loot lootSearch = new Loot();

        if (storeLoot.size() == 0) {
            return null;
        }

        if (storeLoot.containsKey(keySearch)) {
            lootSearch = storeLoot.get(keySearch);
        } else {
            lootSearch = null;
        }
        return lootSearch;
    }
}
