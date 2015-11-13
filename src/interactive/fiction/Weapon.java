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
public class Weapon extends Item {
    
    int power;
    Skills skillbonus;
    
    Weapon(String name, char img, int s){
        super(name, img, s);
        power = 1;
    }
    Weapon(String name, char img, int s, int p){
        super(name, img, s);
        power = p;
    }
}
