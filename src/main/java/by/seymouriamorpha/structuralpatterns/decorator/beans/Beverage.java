package by.seymouriamorpha.structuralpatterns.decorator.beans;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
