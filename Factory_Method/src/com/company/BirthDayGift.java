package com.company;

    public class BirthDayGift extends Offers{

        @Override
        protected void createOffer() {

            gifts.add(new Wallet());
            gifts.add(new Perfume());
            gifts.add(new Teddy());
        }
    }
