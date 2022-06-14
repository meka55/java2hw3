package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        bankAccount.deposit(20000);
        while (true){
            System.out.println("Balance: " + bankAccount.getAmount());
            System.out.println("Skolko hotite snyat: " );
            int with = Integer.parseInt(scanner.next());
            try {
                bankAccount.withDraw(with);
                if (bankAccount.getAmount() == 0) {
                    System.out.println("Balance: " + bankAccount.getAmount());
                    System.out.println("Dengi zanko4ilis, paka");
                    break;
                }
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
