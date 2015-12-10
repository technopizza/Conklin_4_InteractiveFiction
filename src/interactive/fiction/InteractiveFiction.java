package interactive.fiction;

import java.util.ArrayList;
import java.util.Scanner;


public class InteractiveFiction {
    static Scanner userinput;
    static Creature player;
    static Location playerlocation;
    static int locationcounter = 0;
    static boolean lose = false;
    
    
    // initialize all items and archetypes
    
    static final Item leaf = new Item("leaf", 0);
     static final Item bandages = new Item("bandages", 0);
     static final Item fur = new Item("fur", 0);
     static final Item bottle = new Item("bottle", 1);
    
    static final Item helmet = new Item("helmet", 4);
    static final Item sword = new Item("sword", 4);
    static final Item armor = new Item("armor", 4);
    static final Item metalboots = new Item("boots", 4);
    static final Archetype knight = new Archetype("Knight", new Inventory(helmet, armor, sword, metalboots));
    
   static final Item musket = new Item("musket", 4);
    static final Item mail = new Item("mail", 4);
    
     static final Item cutlass = new Item("cutthroat cutlass", 10);
     static final Item captainshat = new Item("Captain's hat", 10);
     static final Item captainsjacket = new Item("Captain's jacket", 10);
     static final Item pegleg = new Item("Peg Leg", -1);
     // initialize all items and archetypes
     
    static final Item cowl = new Item("cowl", 2);
    static final Item dagger = new Item("dagger", 3);
    static final Item cloak = new Item("cloak", 2);
    static final Item boots = new Item("boots", 2);
    static final Archetype rogue = new Archetype("Rogue", new Inventory(cowl, cloak, dagger, boots));
    static final Archetype musketeer = new Archetype("Musketeer", new Inventory(helmet, mail, musket, boots));
    
    // initialize all enemies
    static final Creature leafmonster = new Creature("Leaf Monster", 1, new Inventory(leaf, leaf, leaf, leaf));
    static final Creature robber = new Creature("Bandit", 5, rogue.inventory);
    static final Creature mummy = new Creature("Mummy", 10, new Inventory(bandages, bandages, bandages, bandages));
    static final Creature bigfoot = new Creature("Bigfoot", 15, new Inventory(fur, fur, fur, fur));
    static final Creature knightenemy = new Creature("Sir Fightsalot", 20, knight.inventory);
    static final Creature automaton = new Creature("Automaton", 20, knight.inventory);
    static final Creature pirate = new Creature("Captain Crazy", 15, new Inventory(captainshat, captainsjacket, cutlass, boots));
    
    // Travelable locations
    static Location start = new Location("Pavement Slab", "There is a large slab of cement", "Nothing else is around.", null);
    static Location woods = new Location("Tree Forest", "There are trees everywhere", "They form a fairly large forest", leafmonster);
    static Location meadow = new Location("Small Mammals' Meadow", "There is a small clearing", "small mammals can be seen frolicking about.", robber);
    static Location desert = new Location("Dry Desert", "The heat sears your skin", "There is sand in every direction.", mummy);
    static Location mountain = new Location("Mighty Mountains", "Winding pass through the mountains", "There are large boulders and tall pine trees", bigfoot);
    static Location highlands = new Location("Thistlegrass Downs", "Rocky hills and tough grass for miles...", "no trees, but the occasional peat bog", knightenemy);
    static Location lake = new Location("Lake Larry", "A huge, peaceful lake spreads out before you.", "A few small sailboats can be seen enjoying the weather.", automaton);
    static Location cove = new Location("Coral Cove", "A smuggling center hidden in the cliffs", "Many large ships are loading and unloading illegal contraband.", pirate);
   
    
    static void begin(){ //character creation
        userinput = new Scanner(System.in);
        System.out.println("What is your name");
        String playername = userinput.nextLine();
        System.out.println("Please choose an Archetype:");
        Archetype.listarchetypes();
        int choice = userinput.nextInt() - 1;
        Archetype playerarchetype = (Archetype) Archetype.archetypes.get(choice);
        player = new Creature(playername, 1, playerarchetype.inventory);
    }
    
   static  void listencommands(char charinput){ // main menu input detection
        switch (charinput){
            case '?': helpscreen(); break;
            case 'l': playerlocation.describe(); break; // describes current location
            case 'g': travel();  break; //moves player to next location
            case 'w': System.out.println(playerlocation.name); break; // prints current location
            case 't': player.inventory.items.add((Item) playerlocation.resident.inventory.hands); //allows player to take weapon of dead enemy
                System.out.println("You looted a " + playerlocation.resident.inventory.hands.name + " from the " +  playerlocation.resident.name);break;
            case 'e': System.out.println("Equip which item?"); player.inventory.listinventory(); //equips an item into the weapon slot
                int itemchoice = userinput.nextInt();
                player.inventory.equipHand((Item) player.inventory.items.get(itemchoice - 1)); break;
            case 'i': player.inventory.listinventory(); break; //prints contents of player inventory
            default: break;
        }
    }
   
   static  void travel(){ //moves player to next location
       locationcounter++;
        playerlocation = (Location) Location.locations.get(locationcounter);
        playerlocation.encounter();
        }
   
   static void lose(){ //Lose game message
       System.out.println("You died a horrible death. GAME OVER!");
       lose=true;
        }
    
    
    static void helpscreen(){ //provides instructions to user
        System.out.println("l - look");
        System.out.println("g - travel");
        System.out.println("i - see inventory");
        System.out.println("w - location");
        System.out.println("e - equip weapon");
        System.out.println("t - loot");
    }
    
    static void mainmenu(){
        userinput = new Scanner(System.in); //main menu screen
        System.out.println("What would you like to do? Type \"?\" for a list of commands.");
        char option = userinput.nextLine().charAt(0);
        
        listencommands(option);
        
    }
    
    public static void main(String[] args) {
        Archetype.archetypes.add(knight);
        Archetype.archetypes.add(rogue);
        Archetype.archetypes.add(musketeer);
        Location.locations.add(start);
        Location.locations.add(woods);
        Location.locations.add(meadow); // all global game elements
        Location.locations.add(desert); // are added to their respective arraylists
        Location.locations.add(mountain);
        Location.locations.add(highlands);
        Location.locations.add(lake);
        Location.locations.add(cove);
        playerlocation = start;
        
        
        begin();
        while (!lose){
            if(player.level == 10){ // when a player reaches level 10, it wins!
                System.out.println("You win!!!");
                break;
            }
            mainmenu();
        }
    }

}
