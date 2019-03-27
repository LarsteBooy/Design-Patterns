package com.larstebooy.builder.pattern;

import lombok.Builder;

@Builder
public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

}
