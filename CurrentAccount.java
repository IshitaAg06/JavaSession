package org.example;

public  abstract class CurrentAccount implements BankAccount{


    @Override
    public double getInterestRate() {
        return interestRate;
    }

    private double interestRate;
    public CurrentAccount(double interestRate){
        this.interestRate = interestRate;
    }



}
