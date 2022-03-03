package com.company;

    public class MothersDayGift extends Offers{

        protected void createOffer(){
            gifts.add(new Handbag());
            gifts.add(new Greetingcard());
            gifts.add(new Roses());
        }
    }
