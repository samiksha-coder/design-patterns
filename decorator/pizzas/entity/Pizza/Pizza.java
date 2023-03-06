package decorator.pizzas.entity.Pizza;

import java.util.Optional;

public abstract class Pizza {
    Optional<Pizza> pizza = Optional.ofNullable(null);
    public int cost;
    public String description;

    public Pizza(Pizza pizza) {
        this();
        this.pizza = Optional.ofNullable(pizza);
    }

    public Pizza() {
    }

    public int getCost() {
        return pizza.map(Pizza::getCost).orElse(0) + cost;
    }

    public String getDescription() {
        return pizza.map(i -> i.getDescription() + " + ").orElse("") + description;
    }
}
