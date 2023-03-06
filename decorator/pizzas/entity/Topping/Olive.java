package decorator.pizzas.entity.Topping;

import decorator.pizzas.entity.Pizza.Pizza;

public class Olive extends Topping {
    public Olive(Pizza pizza) {
        super(pizza);
        cost = 20;
        description = this.getClass().getSimpleName();
    }

}
