package decorator.pizzas.entity.Pizza;

import java.util.Optional;

public class BBQChicken extends Pizza {
    public BBQChicken(Pizza pizza) {
        this();
        this.pizza = Optional.of(pizza);
    }

    public BBQChicken() {
        cost = 200;
        description = this.getClass().getSimpleName();
    }

}
