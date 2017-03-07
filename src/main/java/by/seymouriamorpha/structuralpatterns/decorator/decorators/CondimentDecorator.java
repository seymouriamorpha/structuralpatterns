package by.seymouriamorpha.structuralpatterns.decorator.decorators;

import by.seymouriamorpha.structuralpatterns.decorator.beans.Beverage;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
