package interactive.fiction;

import java.util.Random;

public class Creature {

    String name;
    boolean alive;
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
    static void combat(Creature a, Creature b){
       int apower = a.getCombatStrength();
        System.out.println(a.name + " swings its " + a.inventory.hands);
       int bpower = b.getCombatStrength();
       if(apower > bpower){
           System.out.println(b.name + " is knocked dead!");
           b.alive = false;
       }
       else if(bpower > apower){
           System.out.println(b.name + " counters!");
           System.out.println(a.name + " is knocked dead!");
           a.alive = false;
       }
       else if(bpower == apower){
           System.out.println(b.name + "is struck, but counters!");
           System.out.println(a.name + " is knocked dead!");
           System.out.println(b.name + " is knocked dead!");
           b.alive = false; a.alive = false;
       }
    }
}