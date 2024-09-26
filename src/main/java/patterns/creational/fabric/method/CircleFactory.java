package patterns.creational.fabric.method;

import patterns.creational.fabric.method.model.Circle;
import patterns.creational.fabric.method.model.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}