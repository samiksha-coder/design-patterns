package decorator.pizzas.entity.Topping;

import decorator.pizzas.entity.Pizza.Pizza;

public class Tomato extends Topping {
    public Tomato(Pizza pizza) {
        super(pizza);
        cost = 30;
        description = this.getClass().getSimpleName();
    }

}
