package by.seymouriamorpha.structuralpatterns.decorator.beans;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }

}
