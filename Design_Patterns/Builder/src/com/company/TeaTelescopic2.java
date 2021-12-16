package com.company;

public class TeaTelescopic2 {

    String water,tea_powder,sugar,milk_powder;

    public TeaTelescopic2(String water, String tea_powder, String sugar, String milk_powder) {
        this.water = water;
        this.tea_powder = tea_powder;
        this.sugar = sugar;
        this.milk_powder = milk_powder;
    }

    public TeaTelescopic2(String water, String tea_powder, String sugar) {
        this(water,sugar,tea_powder,null);
        this.water = water;
        this.tea_powder = tea_powder;
        this.sugar = sugar;
    }

    public TeaTelescopic2(String water, String tea_powder) {
        this(water,tea_powder,null);
        this.water = water;
        this.tea_powder = tea_powder;
    }

    public TeaTelescopic2(String water) {
        this(water,null);
        this.water = water;
    }
    @Override
    public String toString() {
        return "at TeaTelescopic2's Kitchen we have {" +
                "water='" + water + '\'' +
                ", tea_powder='" + tea_powder + '\'' +
                ", sugar='" + sugar + '\'' +
                ", milk_powder='" + milk_powder + '\'' +
                '}';
    }
}
