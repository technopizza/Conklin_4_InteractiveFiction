package interactive.fiction;

public class Archetype {
    
    //An "archetype" represents the traditional RPG "class",
    //such as wizard, rogue, etc. 
    
    String name;
    // The player's starting inventory is his/her archetype's
    Inventory inventory;
    
    Archetype(String name, Inventory invntry){
        this.name = name;
        inventory = invntry;
    }
}

