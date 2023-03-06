package decorator.pizzas.entity.Pizza;

import java.util.Optional;

public class Farmhouse extends Pizza {
    public Farmhouse(Pizza pizza) {
        this();
        this.pizza = Optional.of(pizza);
    }

    public Farmhouse() {
        cost = 150;
        description = this.getClass().getSimpleName();
    }
}
