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
        
        
        
        Scanner playerInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = playerInput.nextLine();

        System.out.println("Choose an archetype, " + playerName + ".");
        //String playerClass = playerInput.nextLine();
       // Creature player = new Creature(playerName, 1,);
        
        while(true){
            System.out.println(Item.a);
        }
        
    }

}
