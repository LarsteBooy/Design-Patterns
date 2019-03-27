package com.larstebooy.decorator.pattern;

public class ToyCar extends CarDecorator {

    public ToyCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Toy Car.");
    }

}
