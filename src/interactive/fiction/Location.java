/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactive.fiction;

/**
 *
 * @author jconklin2391
 */
public class Location {
        String name;
        String terrain;
        String scenery;
        Creature resident;
        Item item;
        Location connects;
        
        Location(String s, String t, String x, Creature r, Item i, Location l){
            name = s;
            terrain = t;
            scenery =x;
            resident = r;
            item = i;
            connects = l;
            
        }
       
}
