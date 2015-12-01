package interactive.fiction;

import java.util.ArrayList;

public class Inventory {

    // each represents a currently equipped item
    // that corresponds to a part of the body
    Item head, body, hands, feet;

    // Items not currently equipped but still carried
    ArrayList items;

    Inventory(Item head, Item body, Item hands, Item feet/*, ArrayList items*/) {
        this.head = head;
        this.body = body;
        this.hands = hands;
        this.feet = feet;
        //this.items = items;
    }

    int itemBonus(){
        return head.modifier + body.modifier + hands.modifier + feet.modifier;
    }
    
    void listinventory(){
        for(int i = 0; i < items.size(); i++){
            Item currentitem = (Item) items.get(i);
            System.out.println((i + 1) + ". " + currentitem.name);
        }
    }
    
    void equipHead(Item target){
        items.add(head);
        items.remove(target);
        head = target;
    }
    
    void equipBody(Item target){
        items.add(body);
        items.remove(target);
        body = target;
    }
    
    void equipHand(Item target){
        items.add(hands);
        items.remove(target);
        hands = target;
    }
    void equipFeet(Item target){
        items.add(feet);
        items.remove(target);
        feet = target;
    }
}
