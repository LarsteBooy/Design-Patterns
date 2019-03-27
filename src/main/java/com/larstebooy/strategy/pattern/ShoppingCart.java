package com.larstebooy.strategy.pattern;

import com.larstebooy.strategy.pattern.Payment.PayPal;
import com.larstebooy.strategy.pattern.Payment.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public ShoppingCart() {
        paymentMethod = new PayPal("hoi@boe.com", "secret");
    }

    private List<Product> items = new ArrayList<>();

    public PaymentMethod paymentMethod;

    public void addItem(Product product){
        items.add(product);
    }

    public void removeItem(Product product){
        items.remove(product);
    }

    public void calculateCost(){
        double cost = 0;

        for(Product product : items){
            cost += product.getPrice();
        }

        System.out.println("Total price: " + cost);
        System.out.println("Paying using: " + paymentMethod.paymentMethodName());
    }

    public void setPaymentMethod(PaymentMethod newPaymentMethod){
        this.paymentMethod = newPaymentMethod;
    }

}
