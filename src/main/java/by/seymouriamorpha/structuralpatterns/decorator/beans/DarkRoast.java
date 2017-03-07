package by.seymouriamorpha.structuralpatterns.decorator.beans;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.29;
    }

}
