package decorator.icecreams;

import decorator.icecreams.entity.IceCreams.ChocolateIceCream;
import decorator.icecreams.entity.IceCreams.IceCream;
import decorator.icecreams.entity.IceCreams.StrawberryIceCream;
import decorator.icecreams.entity.IceCreams.VanillaIceCream;
import decorator.icecreams.entity.Toppings.Chocochips;
import decorator.icecreams.entity.Toppings.Sprinkles;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new VanillaIceCream(
                new Chocochips(new Sprinkles(new StrawberryIceCream(new ChocolateIceCream()))));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}