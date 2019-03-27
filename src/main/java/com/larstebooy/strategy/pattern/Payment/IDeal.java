package com.larstebooy.strategy.pattern.Payment;

public class IDeal implements PaymentMethod {
    private String Bank;
    private String BankNumber;

    public IDeal(String bank, String bankNumber) {
        Bank = bank;
        BankNumber = bankNumber;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getBankNumber() {
        return BankNumber;
    }

    public void setBankNumber(String bankNumber) {
        BankNumber = bankNumber;
    }

    @Override
    public String paymentMethodName() {
        return "CreditCart";
    }
}
