package by.seymouriamorpha.structuralpatterns.decorator;

import by.seymouriamorpha.structuralpatterns.decorator.beans.Beverage;
import by.seymouriamorpha.structuralpatterns.decorator.beans.DarkRoast;
import by.seymouriamorpha.structuralpatterns.decorator.beans.Decaf;
import by.seymouriamorpha.structuralpatterns.decorator.beans.Espresso;
import by.seymouriamorpha.structuralpatterns.decorator.decorators.Mocha;
import by.seymouriamorpha.structuralpatterns.decorator.decorators.Soy;
import by.seymouriamorpha.structuralpatterns.decorator.decorators.Whip;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Decaf();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
