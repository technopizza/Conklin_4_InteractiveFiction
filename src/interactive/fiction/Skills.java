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
public class Skills {

    int weapons;
    int combat;

    int lore;
    int magic;

    int persuasion;
    int stealth;

    int science;
    int repair;

    int survival;

    Skills(int a) {
        weapons = a;
        combat = a;

        lore = a;
        magic = a;

        persuasion = a;
        stealth = a;

        science = a;
        repair = a;

        survival = a;
    }

    Skills(int a,int b,int c,int d,int e,int f,int g, int h, int i) {
        weapons = a;
        combat = b;

        lore = c;
        magic = d;

        persuasion = e;
        stealth = f;

        science = g;
        repair = h;

        survival = i;
    }

}
