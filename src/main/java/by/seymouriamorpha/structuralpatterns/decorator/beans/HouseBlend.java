package by.seymouriamorpha.structuralpatterns.decorator.beans;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }

}
