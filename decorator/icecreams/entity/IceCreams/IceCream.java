package decorator.icecreams.entity.IceCreams;

import java.util.Optional;

public abstract class IceCream {
    Optional<IceCream> icecream = Optional.ofNullable(null);
    public int cost;
    public String description;

    public IceCream(IceCream iceCream) {
        this.icecream = Optional.ofNullable(iceCream);
    }

    public IceCream() {
    }

    public int getCost() {
        return icecream.map(IceCream::getCost).orElse(0) + cost;
    }

    public String getDescription() {
        return icecream.map(i -> i.getDescription() + " ").orElse("") + description;
    }
}
