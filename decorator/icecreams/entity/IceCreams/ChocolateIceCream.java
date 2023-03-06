package decorator.icecreams.entity.IceCreams;

import java.util.Optional;

public class ChocolateIceCream extends IceCream {
    public ChocolateIceCream(IceCream iceCream) {
        this();
        this.icecream = Optional.of(iceCream);
    }

    public ChocolateIceCream() {
        cost = 7;
        description = "Chocolate Icecream";
    }
}
