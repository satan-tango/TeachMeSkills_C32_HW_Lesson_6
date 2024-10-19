package com.varkovich.lesson_6.task_2.entity;

public class CreditCard {

    public String accountNumber;
    public double currentAmount;

    public void showInformationAboutCard() {
        System.out.printf("Card account number: %s\nCurrent amount of money: %.2f USD\n\n", accountNumber, currentAmount);
    }

    public CreditCard(String accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }
}
