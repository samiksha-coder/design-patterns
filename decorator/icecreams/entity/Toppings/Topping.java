package decorator.icecreams.entity.Toppings;

import java.util.Optional;

import decorator.icecreams.entity.IceCreams.IceCream;

public abstract class Topping extends IceCream {
    int cost;
    Optional<IceCream> iceCream = Optional.ofNullable(null);
    String description;

    public Topping(IceCream iceCream) {
        super();
        this.iceCream = Optional.ofNullable(iceCream);
    }

    public int getCost() {
        return iceCream.map(IceCream::getCost).orElse(0) + cost;
    }

    public String getDescription() {
        return iceCream.map(i -> i.getDescription() + " ").orElse("") + description;
    }
}
