package circus.stuff;

import circus.stuff.Equipment;

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
