package patterns.creational.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
}