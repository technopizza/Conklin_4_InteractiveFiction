package interactive.fiction;

class Item {

    String name;
    int modifier;

    Item(String name) {
        this.name = name;
        modifier = 1;
    }
    
    Item(String name, int mod) {
        this.name = name;
        modifier = mod;
    }
}
