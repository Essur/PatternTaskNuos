import patterns.behavioral.observer.NewsAgency;
import patterns.behavioral.observer.NewsChannel;
import patterns.creational.builder.Car;
import patterns.creational.fabric.genreicfabric.GenericFactory;
import patterns.creational.fabric.method.CircleFactory;
import patterns.creational.fabric.method.ShapeFactory;
import patterns.creational.fabric.method.SquareFactory;
import patterns.creational.fabric.method.model.Circle;
import patterns.creational.fabric.method.model.Shape;
import patterns.creational.fabric.method.model.Square;
import patterns.creational.singleton.SingletonExample;
import patterns.structural.adapter.Adapter;
import patterns.structural.adapter.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        showConsoleMenu();
    }

    private static void showConsoleMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display the menu
            System.out.println("""
                    \nMenu:
                    1. Singleton
                    2. Abstract fabric with generic
                    3. Factory method
                    4. Builder
                    5. Observer
                    6. Adapter
                    0. Exit
                    Enter your choice: """);
            // Get user input
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Singleton demo");
                    singletonDemo();
                    break;
                case 2:
                    System.out.println("Abstract fabric with generic ");
                    genericFactory();
                    break;
                case 3:
                    System.out.println("Factory method");
                    factoryMethod();
                    break;
                case 4:
                    System.out.println("Builder ");
                    builderPattern();
                    break;
                case 5:
                    System.out.println("Observer ");
                    observerPattern();
                    break;
                case 6:
                    System.out.println("Adapter ");
                    adapterPattern();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    /**The Observer pattern defines a one-to-many dependency, where one object (the subject) notifies multiple observers of any state changes.**/
    private static void observerPattern() {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setNews("Breaking News!");
    }

    /**Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.**/
    private static void adapterPattern() {
        Input input = new Input("Oleg", "Hello");
        Adapter adapter = new Adapter();
        adapter.getInput(input);
        System.out.println(adapter.getMessage());
    }

    /**The Builder pattern allows constructing complex objects step by step. It's useful for creating objects with many optional parameters.**/
    private static void builderPattern() {
        Car nissan = Car.builder().make("Nissan").model("Silvia s14").year(2000).color("Black").build();
        System.out.println(nissan);
    }

    /**This pattern extends the Factory concept by using generics to produce objects of various types in a type-safe manner.**/
    private static void genericFactory() {
        GenericFactory<Circle> circleFactory = new GenericFactory<>(Circle.class);
        Shape circle = circleFactory.createInstance();
        circle.draw();

        GenericFactory<Square> squareFactory = new GenericFactory<>(Square.class);
        Shape square = squareFactory.createInstance();
        square.draw();
    }

    /**The Factory Method defines an interface for creating objects but allows subclasses to alter the type of objects that will be created.**/
    private static void factoryMethod() {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.renderShape();

        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.renderShape();
    }

    /**Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.**/
    private static void singletonDemo () {
        SingletonExample singletonExample = SingletonExample.getInstance();
    }
}
