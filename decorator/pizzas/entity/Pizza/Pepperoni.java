package decorator.pizzas.entity.Pizza;

import java.util.Optional;

public class Pepperoni extends Pizza {
    public Pepperoni(Pizza pizza) {
        this();
        this.pizza = Optional.of(pizza);
    }

    public Pepperoni() {
        cost = 180;
        description = this.getClass().getSimpleName();
    }
}
