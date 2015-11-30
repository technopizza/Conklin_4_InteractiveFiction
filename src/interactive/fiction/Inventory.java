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

}
