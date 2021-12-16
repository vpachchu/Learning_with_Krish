package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Offers offer1=GiftFactory.createOffer(OfferCode.BirthDayGift);
        System.out.println("BirthDay Gift offer "+offer1);
        Offers offer2=GiftFactory.createOffer(OfferCode.MothersDayGift);
        System.out.println("Mother's Day Gift offer "+offer2);
        Offers offer3=GiftFactory.createOffer(OfferCode.ValentineDayGift);
        System.out.println("Valentine's Day Gift offer "+offer3);
    }
}

