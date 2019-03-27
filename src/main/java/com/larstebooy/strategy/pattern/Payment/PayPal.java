package com.larstebooy.strategy.pattern.Payment;

public class PayPal implements PaymentMethod {

    private String email;
    private String password;

    public PayPal(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String paymentMethodName() {
        return "PayPal";
    }
}
