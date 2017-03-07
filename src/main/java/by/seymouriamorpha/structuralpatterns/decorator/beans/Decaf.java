package by.seymouriamorpha.structuralpatterns.decorator.beans;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 2.88;
    }

}
