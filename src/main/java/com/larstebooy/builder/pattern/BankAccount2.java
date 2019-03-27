package com.larstebooy.builder.pattern;

//BUILDER PATTERN

public class BankAccount2 {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    private BankAccount2(Builder builder){
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    //GETTERS
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //BUILDER
    public static class Builder{
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder accountNumber(final long accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder owner(final String owner){
            this.owner = owner;
            return this;
        }

        public Builder branch(final String branch){
            this.branch = branch;
            return this;
        }

        public Builder balance(final double balance){
            this.balance = balance;
            return this;
        }

        public Builder interestRate(final double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount2 build(){
            return new BankAccount2(this);
        }
    }

    public static Builder builder(){
        return new BankAccount2.Builder();
    }
}
