package patterns.creational.fabric.method;

import patterns.creational.fabric.method.model.Shape;

public abstract class ShapeFactory {
    public abstract Shape createShape();

    public void renderShape() {
        Shape shape = createShape();
        shape.draw();
    }
}