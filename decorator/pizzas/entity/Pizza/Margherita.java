package decorator.pizzas.entity.Pizza;

import java.util.Optional;

public class Margherita extends Pizza {
    public Margherita(Pizza pizza) {
        this();
        this.pizza = Optional.of(pizza);
    }

    public Margherita() {
        cost = 200;
        description = this.getClass().getSimpleName();
    }

}
