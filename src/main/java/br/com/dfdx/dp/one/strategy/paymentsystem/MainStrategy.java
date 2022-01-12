package br.com.dfdx.dp.one.strategy.paymentsystem;

import br.com.dfdx.dp.one.strategy.paymentsystem.controller.CreditCardAlgorithm;
import br.com.dfdx.dp.one.strategy.paymentsystem.controller.PayPalAlgorithm;
import br.com.dfdx.dp.one.strategy.paymentsystem.controller.ShoppingCart;
import br.com.dfdx.dp.one.strategy.paymentsystem.model.Product;

public class MainStrategy {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // payment decisions
        cart.pay(new PayPalAlgorithm("maria@teste.com", "test123"));

        cart.pay(new CreditCardAlgorithm("Maria", "1234123412341234"));

    }
}
