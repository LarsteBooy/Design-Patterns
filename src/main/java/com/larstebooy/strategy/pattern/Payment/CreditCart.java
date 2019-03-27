package com.larstebooy.strategy.pattern.Payment;

import java.util.Date;

public class CreditCart implements PaymentMethod {
    private String name;
    private int number;
    private int ccvCode;
    private Date expiringDate;

    public CreditCart(String name, int number, int ccvCode, Date expiringDate) {
        this.name = name;
        this.number = number;
        this.ccvCode = ccvCode;
        this.expiringDate = expiringDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCcvCode() {
        return ccvCode;
    }

    public void setCcvCode(int ccvCode) {
        this.ccvCode = ccvCode;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }

    @Override
    public String paymentMethodName() {
        return "CreditCart";
    }
}
