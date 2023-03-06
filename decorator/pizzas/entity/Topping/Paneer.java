package decorator.pizzas.entity.Topping;

import decorator.pizzas.entity.Pizza.Pizza;

public class Paneer extends Topping {
    public Paneer(Pizza pizza) {
        super(pizza);
        cost = 60;
        description = this.getClass().getSimpleName();
    }

}
