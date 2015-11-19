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
    Location pizzastore;
    Location pasture;
    
    public static void main(String[] args) {
        
        
        
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
       pasture = new Location("Peaceful Pastures", "open fields", String "green grass and rolling hills", Creature.sheep, Item.tire, null)
       
        while(true){
            System.out.println();
        }
        
    }

}
