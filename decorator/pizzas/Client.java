package decorator.pizzas;

import decorator.pizzas.entity.Pizza.BBQChicken;
import decorator.pizzas.entity.Pizza.Pizza;
import decorator.pizzas.entity.Topping.Cheese;
import decorator.pizzas.entity.Topping.Paneer;
import decorator.pizzas.entity.Topping.Tomato;

public class Client {
    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
