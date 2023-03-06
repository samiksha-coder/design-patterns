package decorator.pizzas.entity.Topping;

import decorator.pizzas.entity.Pizza.Pizza;

public abstract class Topping extends Pizza {
    public Topping(Pizza pizza) {
        super(pizza);
    }
}
