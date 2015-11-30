package interactive.fiction;

public class Creature {

    String name;
    int level; //overall power of creature; used for most checks
    int health; //vitality of creature; creature dies when health reaches zero
    Inventory inventory; //instance to track each creatures items

    Creature(String name, int lvl, Inventory invntry) {
        this.name = name;
        level = lvl;
        inventory = invntry;
    }    
}