package decorator.icecreams.entity.Toppings;

import decorator.icecreams.entity.IceCreams.IceCream;

public class Cherries extends Topping {

    public Cherries(IceCream iceCream) {
        super(iceCream);
        cost = 5;
        description = "Cherries";
    }
}
