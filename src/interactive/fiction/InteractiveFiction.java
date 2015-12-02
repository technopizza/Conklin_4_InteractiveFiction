package interactive.fiction;

import java.util.ArrayList;
import java.util.Scanner;


public class InteractiveFiction {
    static Scanner userinput;
    static Creature player;
    static Location playerlocation;
    static int locationcounter = 0;
    
    
    
    
    
    static final Item leaf = new Item("leaf", 0);
    
    
    static final Item helmet = new Item("helmet", 4);
    static final Item sword = new Item("sword", 4);
    static final Item armor = new Item("armor", 4);
    static final Item metalboots = new Item("boots", 4);
    static final Archetype knight = new Archetype("Knight", new Inventory(helmet, armor, sword, metalboots));
    
    static final Item cowl = new Item("cowl", 2);
    static final Item dagger = new Item("dagger", 3);
    static final Item cloak = new Item("cloak", 2);
    static final Item boots = new Item("boots", 2);
    static final Archetype rogue = new Archetype("Rogue", new Inventory(cowl, cloak, dagger, boots));
    
    static final Creature leafmonster = new Creature("Leaf Monster", 1, new Inventory(leaf, leaf, leaf, leaf));
    static final Creature robber = new Creature("Bandit", 1, rogue.inventory);
    
    static Location start = new Location("Pavement Slab", "There is a large slab of cement", "Nothing else is around.", null);
    static Location woods = new Location("Tree Forest", "There are trees everywhere", "They form a fairly large forest", leafmonster);
    static Location meadow = new Location("Small Mammals' Meadow", "There is a small clearing", "small mammals can be seen frolicking about.", robber);
    
   
    
    static void begin(){
        userinput = new Scanner(System.in);
        System.out.println("What is your name");
        String playername = userinput.nextLine();
        System.out.println("Please choose an Archetype:");
        Archetype.listarchetypes();
        int choice = userinput.nextInt();
        Archetype playerarchetype = (Archetype) Archetype.archetypes.get(choice);
        player = new Creature(playername, 1, playerarchetype.inventory);
    }
    
   static  void listencommands(char charinput){
        switch (charinput){
            case '?': helpscreen(); break;
            case 'l': playerlocation.describe(); break;
            case 'g': playerlocation.encounter(); break;
            case 'w': System.out.println(playerlocation.name); break;
            //case 'e':
            case 'i': player.inventory.listinventory(); break;
        }
    }
   
   static  void travel(){
       locationcounter++;
        playerlocation = (Location) Location.locations.get(locationcounter);
        playerlocation.encounter();
        }
    
    
    static void helpscreen(){
        System.out.println("l - look");
        System.out.println("g - travel");
        System.out.println("i - see inventory");
        System.out.println("w - location");
        //System.out.println("e - equip");
    }
    
    static void mainmenu(){
        userinput = new Scanner(System.in);
        System.out.println("What would you like to do? Type \"?\" for a list of commands.");
        char option = userinput.nextLine().charAt(0);
        
        listencommands(option);
        
    }
    
    public static void main(String[] args) {
        Archetype.archetypes.add(knight);
        Archetype.archetypes.add(rogue);
        Location.locations.add(start);
        Location.locations.add(woods);
        Location.locations.add(meadow);
        begin();
        while (true){
            mainmenu();
        }
//        Location pizzastore, pasture, woods, swamp, desert, mountains, valley, plain, castle;
//        castle = new Location("King's Castle", "open", "expansive plains", Creature.king, Item.brick, null);
//        plain = new Location("Great Plains", "open", "expansive plains", Creature.thug ,Item.brick, castle);
//        valley = new Location("Grey Valley", "closed", "forest", Creature.thug ,Item.brick, plain);
//        
//        Scanner playerInput = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String playerName = playerInput.nextLine();
//
//        System.out.println("Hello, " + playerName + ". You are a pizza delivery man.");
//        System.out.println("You live in the kingdom of Irakistan, ruled by the wise and benevolent King Mohizzle Abdizzle.");
//        System.out.println("Lately, Irakistan has been having trouble with monsters and bandits, so not all the roads are safe.");
//        System.out.println("His Majesty has ordered his weekly royal pizza, and you have been tasked to deliver it.");
//        System.out.println("Good Luck!");
//        System.out.println("Press any key to start...");
//        playerInput.nextLine();
//        System.out.println("...");
//        System.out.println("...");
//        System.out.println("...");
//        //String playerClass = playerInput.nextLine();
//       Creature player = new Creature(playerName, 1, Archetype.pizza.inventory);
//       player.location=valley;
//       //pasture = new Location("Peaceful Pastures", "open fields", "green grass and rolling hills", Creature.sheep, Item.tire, woods);
//       
//        while(true){
//            System.out.println("What would you like to do?");
//            System.out.println("i - inventory   w - location    l - look  t - take item     d - drop item   g - go to next");
//            char option = playerInput.nextLine().charAt(0);
//            switch(option){
//                case 'i': System.out.println(player.inventory); break;
//                case 'w': System.out.println(player.location); break;
//                case 'l': player.location.describe(); break;
//                case 't': player.takeItem(); break;
//                case 'd': player.dropItem(); break;
//                case 'g': player.location = player.location.connects;
//            }
//        }
        
    }

}
