package interactive.fiction;

import java.util.Random;

public class Creature {

    String name;
    boolean alive = true;
    int level; //overall power of creature; used for most checks
    
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
    static void combat(Creature a, Creature b){ //decides winner based on greater combat strength
       int apower = a.getCombatStrength();
        System.out.println(a.name + " swings its " + a.inventory.hands.name);
       int bpower = b.getCombatStrength();
       if(apower > bpower){ // Creature A win condition
           System.out.println(b.name + " is knocked dead!");
           b.alive = false; a.level++;
       }
       else if(bpower > apower){ // Creature B win condition
           System.out.println(b.name + " counters!");
           System.out.println(a.name + " is knocked dead!");
           a.alive = false; b.level++;
       }
       else if(bpower == apower){ // In a tie, both creatures die
           System.out.println(b.name + "is struck, but counters!");
           System.out.println(a.name + " is knocked dead!");
           System.out.println(b.name + " is knocked dead!");
           b.alive = false; a.alive = false;
       }
    }
}