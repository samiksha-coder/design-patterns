package decorator.icecreams.entity.IceCreams;

import java.util.Optional;

public class StrawberryIceCream extends IceCream {
    public StrawberryIceCream(IceCream iceCream) {
        this();
        this.icecream = Optional.of(iceCream);
    }

    public StrawberryIceCream() {
        cost = 10;
        description = "Strawberry Icecream";
    }
}
