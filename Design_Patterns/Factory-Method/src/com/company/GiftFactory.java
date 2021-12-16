package com.company;

public class GiftFactory {

    public static Offers createOffer(OfferCode offerCode){

        switch (offerCode)
        {
            case BirthDayGift :
                return new BirthDayGift();
            case MothersDayGift:
                return new MothersDayGift();
            case ValentineDayGift:
                return new ValentineDayGift();
            default:
                return null;

        }
    }
}
