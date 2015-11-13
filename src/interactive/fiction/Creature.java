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
public class Creature {

    String name;
    int level;
    Attributes attributes;
    Skills skills;
    Trait[] traits;
    Archetype archetype;
    Item[] inventory;
    
    int skillPoints;
    int experiencePoints;

    Creature(String n, int l, Trait[] t, Skills s, Item[] i) {
        name = n;
        level = l;
        traits = t;
        inventory = i;
        skills = s;
    }

}