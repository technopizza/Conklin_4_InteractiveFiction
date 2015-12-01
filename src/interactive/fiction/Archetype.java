package interactive.fiction;

import java.util.ArrayList;

public class Archetype {
    
    //An "archetype" represents the traditional RPG "class",
    //such as wizard, rogue, etc. 
    
    String name;
    // The player's starting inventory is his/her archetype's
    Inventory inventory;
    static ArrayList archetypes = new ArrayList();
    Archetype(String name, Inventory invntry){
        this.name = name;
        inventory = invntry;
    }
    static void listarchetypes(){
        for(int i = 0; i < archetypes.size(); i++){
            Archetype currentitem = (Archetype) archetypes.get(i);
            System.out.println((i + 1) + ". " + currentitem.name);
        }
    }
}

