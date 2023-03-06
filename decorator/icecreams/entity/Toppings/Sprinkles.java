package decorator.icecreams.entity.Toppings;

import decorator.icecreams.entity.IceCreams.IceCream;

public class Sprinkles extends Topping {

    public Sprinkles(IceCream iceCream) {
        super(iceCream);
        cost = 3;
        description = "Sprinkles";
    }
}
