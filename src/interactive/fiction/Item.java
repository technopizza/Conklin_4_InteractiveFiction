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
class Item {

    String name;
    char image;
    int modifier;

    Item(String n, char img, int s) {
        name = n;
        image = img;
        modifier = s;
    }
//         static Weapon longbow = new Weapon("longbow", '➵', 4);
//static Weapon shortbow = new Weapon("shortbow", '➵', 3);
//    static Weapon longsword = new Weapon("longsword", '⚔', 4);
//    static Weapon shortsword = new Weapon("shortsword", '⚔', 3);
    static final Item plunger = new Item("plunger", '/', 1);
    static final Item hat = new Item("hat", 'O', 1);
    static final Item katana = new Item("katana", '⚔', 7);
    
    static final Item tire = new Item("tire", 'O', 3);

    static final Item pizza = new ItemConsumable("pizza slice", '?', 1, 8);

    //static final Item playingcard = new ItemConsumable("playing card", '🃑', 9);
    static final Item holygrail = new ItemConsumable("the Holy Grail", '✝', 9);
    static final Item lightsaber = new Item("lightsaber", '✝', 10);
    static final Item brick = new Item("brick", '.', 1);
    static final Item laser = new Item("laserbeam", '-', 10);
    static final Item sword = new Item("sword", '⚔', 3);
    //static final Item katana = new Item("katana", '⚔', 7);
}
