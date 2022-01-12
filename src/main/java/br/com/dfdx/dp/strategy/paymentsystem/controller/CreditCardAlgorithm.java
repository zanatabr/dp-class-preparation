package br.com.dfdx.dp.strategy.paymentsystem.controller;

import br.com.dfdx.dp.strategy.paymentsystem.model.Payment;

public class CreditCardAlgorithm implements Payment {

    private String name;
    private String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card");
    }
}
