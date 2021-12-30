package com.company;

import java.util.ArrayList;

public class Cart
{
    ArrayList<Items> items=new ArrayList<>();

    public void addItem(Items items)
    {
        items.add(items);
    }

    public ArrayList<Items> getItems() {
        this.items=(ArrayList<Items>) items.clone();
        return items;
    }

    public class CartMemento{
        ArrayList<Items> items;

        public CartMemento(ArrayList<Items> items) {
            this.items = items;
        }

        private ArrayList<Items> getItems() {
            return  items;
        }

        public CartMemento save()
        {
            return new CartMemento(getItems());
        }



    }

    public CartMemento save()
    {
        return new CartMemento(getItems());
    }

    public void revert(CartMemento cartMemento)
    {
    items=cartMemento.getItems();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
