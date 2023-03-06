package decorator.icecreams.entity.Toppings;

import decorator.icecreams.entity.IceCreams.IceCream;

public class Chocochips extends Topping {

    public Chocochips(IceCream iceCream) {
        super(iceCream);
        cost = 2;
        description = "Chocochips";
    }
}
