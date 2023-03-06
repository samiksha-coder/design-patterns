package decorator.pizzas.entity.Topping;

import decorator.pizzas.entity.Pizza.Pizza;

public class Cheese extends Topping {
    public Cheese(Pizza pizza) {
        super(pizza);
        cost = 80;
        description = this.getClass().getSimpleName();
    }
}
