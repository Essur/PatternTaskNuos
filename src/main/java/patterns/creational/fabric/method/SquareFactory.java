package patterns.creational.fabric.method;

import patterns.creational.fabric.method.model.Shape;
import patterns.creational.fabric.method.model.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}