package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CareTaker careTaker=new CareTaker();
        Cart cart=new Cart();
        cart.addItem("tooth brush");

        careTaker.save(cart);

        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);
    }
}
