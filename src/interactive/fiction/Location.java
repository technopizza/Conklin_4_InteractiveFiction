package interactive.fiction;

import java.util.ArrayList;

public class Location {
        String name;
        String terrain;
        String scenery;
        Creature resident;
        static ArrayList locations = new ArrayList();
                
        Location(String s, String t, String x, Creature r){
            name = s;
            terrain = t;
            scenery = x;
            resident = r;

        }
       void describe(){
           System.out.println(terrain);
           System.out.println(scenery);        
       }
       void encounter(){ // happens when player first enters location
           describe();
           System.out.println("A " + resident.name + " stands in your way. ");
           System.out.println("You must fight it!");
           
           Creature.combat(InteractiveFiction.player, InteractiveFiction.playerlocation.resident);
           if(InteractiveFiction.player.alive){
               System.out.println("Made it to level " + InteractiveFiction.player.level + "!");
           }
           else{
               InteractiveFiction.lose();
           }
       }
}
