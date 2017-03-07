package by.seymouriamorpha.structuralpatterns.decorator.decorators;

import by.seymouriamorpha.structuralpatterns.decorator.beans.Beverage;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .2 + beverage.cost();
    }

}
