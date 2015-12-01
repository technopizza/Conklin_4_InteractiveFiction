package interactive.fiction;

import java.util.Random;

public class Creature {

    String name;
    int level; //overall power of creature; used for most checks
    int health; //vitality of creature; creature dies when health reaches zero
    Inventory inventory; //instance to track each creatures items
    static Random random = new Random();

    Creature(String name, int lvl, Inventory invntry) {
        this.name = name;
        level = lvl;
        inventory = invntry;
    }
    int getCombatStrength(){ //calculates the creatures total combat strength
       int combatvariance = random.nextInt(level);
       return combatvariance + level + inventory.itemBonus();
    }
    
}