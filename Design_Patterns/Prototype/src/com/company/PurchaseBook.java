package com.company;

public class PurchaseBook extends Books{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PurchaseBook{" +
                "price=" + price +
                '}';
    }
}
