/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactive.fiction;

import java.util.ArrayList;

/**
 *
 * @author jconklin2391
 */
public class Creature {

    String name;
    int level;
    Skills skills;
    Trait[] traits;
    Archetype archetype;
    Item equipped;
    ArrayList inventory;
    Location location;
    
    int skillPoints;
    int experiencePoints;

    Creature(String n, int l, Item i) {
        name = n;
        level = l;
        //traits = t;
        inventory.add(i);
    }

    static final Creature sheep = new Creature("sheep", 1, null);
    
}