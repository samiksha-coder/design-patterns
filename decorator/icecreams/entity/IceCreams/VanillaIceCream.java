package decorator.icecreams.entity.IceCreams;

import java.util.Optional;

public class VanillaIceCream extends IceCream {
    public VanillaIceCream(IceCream iceCream) {
        this();
        this.icecream = Optional.of(iceCream);
    }

    public VanillaIceCream() {
        cost = 5;
        description = "Vanilla Icecream";
    }
}
