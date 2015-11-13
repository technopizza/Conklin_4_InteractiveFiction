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
class Item {

    String name;
    char image;
    int size;

    Item(String n) {
        name = n;
        image = '?';
        size = 1;
    }

    Item(String n, char img, int s) {
        name = n;
        image = img;
        size = s;
    }
         static Weapon longbow = new Weapon("longbow", '➵', 4);
static Weapon shortbow = new Weapon("shortbow", '➵', 3);
    static Weapon longsword = new Weapon("longsword", '⚔', 4);
    static Weapon shortsword = new Weapon("shortsword", '⚔', 3);
}
