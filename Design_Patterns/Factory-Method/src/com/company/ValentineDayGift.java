package com.company;

    public class ValentineDayGift extends Offers{

        protected void createOffer()
        {
            gifts.add(new Perfume());
            gifts.add(new Teddy());
            gifts.add(new Roses());
        }
    }
