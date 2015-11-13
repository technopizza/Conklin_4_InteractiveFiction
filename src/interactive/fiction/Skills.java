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

    int archery, athletics, chemistry, craftmanship, literacy, lore, magic, medicine, persuasion, stealth, swordsmanship;

    Skills(int i) {

        this.archery = i;
        this.athletics = i;
        this.chemistry = i;
        this.craftmanship = i;
        this.literacy = i;
        this.lore = i;
        this.magic = i;
        this.medicine = i;
        this.persuasion = i;
        this.stealth = i;
        this.swordsmanship = i;
    }
    
    Skills(int archery, int athletics, int chemistry, int craftmanship, int literacy, int lore, int magic, int medicine, int persuasion, int stealth, int swordsmanship) {

        this.archery = archery;
        this.athletics = athletics;
        this.chemistry = chemistry;
        this.craftmanship = craftmanship;
        this.literacy = literacy;
        this.lore = lore;
        this.magic = magic;
        this.medicine = medicine;
        this.persuasion = persuasion;
        this.stealth = stealth;
        this.swordsmanship = swordsmanship;
    }

}
