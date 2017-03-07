package by.seymouriamorpha.structuralpatterns.decorator.decorators;

import by.seymouriamorpha.structuralpatterns.decorator.beans.Beverage;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .5 + beverage.cost();
    }

}
