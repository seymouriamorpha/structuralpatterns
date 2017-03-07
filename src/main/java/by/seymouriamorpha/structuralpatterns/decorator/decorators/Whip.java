package by.seymouriamorpha.structuralpatterns.decorator.decorators;

import by.seymouriamorpha.structuralpatterns.decorator.beans.Beverage;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .3 + beverage.cost();
    }

}
