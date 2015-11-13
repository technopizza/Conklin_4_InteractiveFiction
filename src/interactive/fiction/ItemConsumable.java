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
class ItemConsumable extends Item {

    int uses_total, uses_remaining;

    ItemConsumable(String name, char img, int s) {
        super(name, img, s);
        uses_total = 1;
        uses_remaining = uses_total;
    }

    ItemConsumable(String name, char img, int s, int usetot) {
        super(name, img, s);
        uses_total = usetot;
        uses_remaining = uses_total;
    }

    void useItem() {
        uses_remaining--;
    }

}
