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
public class Archetype {
    String name;
    Trait[] traits;
    Attributes attributes; 
    Skills skills;
    Item[] inventory;
    
    Archetype(String n, Attributes a, Skills s, Item[] i){
        name = n;
        attributes = a;
        skills = s;
        inventory = i;
    }
}

