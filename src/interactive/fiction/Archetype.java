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
    Skills skills; 
    Item inventory;
    
    Archetype(String n, Skills a, Item i){
        name = n;
        skills = a;
        inventory = i;
    }

    static final Archetype plumber = new Archetype("Plumber", new Skills(3, 3, 3, 0, 3, 3, 3, 5, 3), Item.plunger);
    static final Archetype ninja = new Archetype("Ninja", new Skills(7, 7, 3, 0, 3, 10, 3, 3, 5), Item.katana);
    static final Archetype pizza = new Archetype("Pizza Delivery Guy", new Skills(3, 3, 3, 0, 4, 3, 3, 3, 3), Item.pizza);
}

