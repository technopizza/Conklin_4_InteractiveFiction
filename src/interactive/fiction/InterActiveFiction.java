/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactive.fiction;

import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class InterActiveFiction {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Location pizzastore, pasture, woods, swamp, desert, mountains, valley, plain, castle;
        castle = new Location("King's Castle", "open", "expansive plains", Creature.king, Item.brick, null);
        plain = new Location("Great Plains", "open", "expansive plains", Creature.thug ,Item.brick, castle);
        valley = new Location("Grey Valley", "closed", "forest", Creature.thug ,Item.brick, plain);
        
        Scanner playerInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = playerInput.nextLine();

        System.out.println("Hello, " + playerName + ". You are a pizza delivery man.");
        System.out.println("You live in the kingdom of Irakistan, ruled by the wise and benevolent King Mohizzle Abdizzle.");
        System.out.println("Lately, Irakistan has been having trouble with monsters and bandits, so not all the roads are safe.");
        System.out.println("His Majesty has ordered his weekly royal pizza, and you have been tasked to deliver it.");
        System.out.println("Good Luck!");
        System.out.println("Press any key to start...");
        playerInput.nextLine();
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        //String playerClass = playerInput.nextLine();
       Creature player = new Creature(playerName, 1, Archetype.pizza.inventory);
       player.location=valley;
       //pasture = new Location("Peaceful Pastures", "open fields", "green grass and rolling hills", Creature.sheep, Item.tire, woods);
       
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("i - inventory   w - location    l - look  t - take item     d - drop item   g - go to next");
            char option = playerInput.nextLine().charAt(0);
            switch(option){
                case 'i': System.out.println(player.inventory); break;
                case 'w': System.out.println(player.location); break;
                case 'l': player.location.describe(); break;
                case 't': player.takeItem(); break;
                case 'd': player.dropItem(); break;
                case 'g': player.location = player.location.connects;
            }
        }
        
    }

}
