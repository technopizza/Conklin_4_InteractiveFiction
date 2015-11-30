package interactive.fiction;

class ItemConsumable extends Item {

    int uses_total, uses_remaining;

    ItemConsumable(String name, int mod) {
        super(name, mod);
        uses_total = 1;
        uses_remaining = uses_total;
    }

    ItemConsumable(String name, int mod, int usetot) {
        super(name, mod);
        uses_total = usetot;
        uses_remaining = uses_total;
    }

    void useItem() {
        uses_remaining--;
    }

}
