package com.company;

public class BankAccount {
   private double amount;

    public double getAmount() {
        return amount;
    }

    public void  deposit(double sum){
        amount = getAmount() + sum;
    }
    public void  withDraw(int sum) throws LimitException {
        if (getAmount() < sum){
            throw new LimitException("Deneg net, snimi druguyu summu");
        }else
        amount = getAmount() - sum;
    }
}
