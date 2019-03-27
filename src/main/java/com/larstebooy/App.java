package com.larstebooy;

import com.larstebooy.bounded.parameters.Biertjuh;
import com.larstebooy.bounded.parameters.Box;
import com.larstebooy.bounded.parameters.Coolbest;
import com.larstebooy.bounded.parameters.Ijsthee;
import com.larstebooy.builder.pattern.BankAccount;
import com.larstebooy.builder.pattern.BankAccount2;
import com.larstebooy.composite.pattern.Circle;
import com.larstebooy.composite.pattern.Drawing;
import com.larstebooy.composite.pattern.Shape;
import com.larstebooy.composite.pattern.Triangle;
import com.larstebooy.decorator.pattern.*;
import com.larstebooy.observer.pattern.Alerts;
import com.larstebooy.observer.pattern.ConditionObserver;
import com.larstebooy.strategy.pattern.Payment.IDeal;
import com.larstebooy.strategy.pattern.Product;
import com.larstebooy.strategy.pattern.ShoppingCart;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //BOUNDED PARAMETERS
        Box<Biertjuh> kratje = new Box<>();
        Box<Coolbest> doosjeCoolbest = new Box<>();
        Box<Ijsthee> doosjeIjsthee = new Box<>();

        //BUILDER PATTERN
        //LOMBOK
        BankAccount bankAccount = BankAccount.builder().balance(132412341.0).branch("weethemwel").interestRate(2.0).owner("ik").build();

        //NIET LOMBOK Custom
        BankAccount2 bankAccount2 = BankAccount2.builder().balance(12341234.0).branch("weetemwel").build();

        //DECORATOR PATTERN
        System.out.println("\n=======DECORATOR PATTERN=======");
        decorator();

        //COMPOSITE PATTERN
        System.out.println("\n=======COMPOSITE PATTERN=======");
        composite();

        //STRATEGY PATTERN
        System.out.println("\n=======STRATEGY PATTERN=======");
        strategy();

        //OBSERVER PATTERN
        System.out.println("\n=======OBSERVER PATTERN=======");
        observer();

    }

    private static void observer() {
        Alerts alerts = new Alerts();

        ConditionObserver observer1 = new ConditionObserver(alerts);

        alerts.setWeatherConditions("Stormy");
        alerts.setNationalThreatColor("Orange");
        alerts.setThreatInstructions("Stay inside");
        alerts.setNationalThreatColor("red");
    }

    private static void strategy() {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Vleespoeder", 16.66);
        Product product2 = new Product("Babypoeder", 8.88);

        cart.addItem(product1);
        cart.addItem(product2);

        cart.calculateCost();

        cart.setPaymentMethod(new IDeal("Rabobank", "NL23 RABO 1817 1245 65"));

        cart.calculateCost();

    }

    private static void decorator() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar((new ToyCar(new BasicCar()))));
        sportsLuxuryCar.assemble();
    }

    private static void composite() {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle2);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("Green");
    }
}
