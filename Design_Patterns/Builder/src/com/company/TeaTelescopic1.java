package com.company;

public class TeaTelescopic1{
    String water,tea_powder,sugar,milk_powder;

    public TeaTelescopic1(String water)
    {
        this.water=water;
    }

    public TeaTelescopic1(String water,String tea_powder)
    {
        this(water);
        this.tea_powder=tea_powder;
    }

    public TeaTelescopic1(String water, String tea_powder, String sugar)
    {
        this(water,tea_powder);
        this.sugar=sugar;
       // System.out.println("Wow!! you can make a Black Tea !!");


    }

    public TeaTelescopic1(String water, String tea_powder, String sugar, String milk_powder)
    {
        this(water,tea_powder,sugar);
        this.milk_powder=milk_powder;
     //   System.out.println("and a Tea as well :) !!");

    }

    @Override
    public String toString() {
        return "at TeaTelescopic1's Kitchen we have {" +
                "water='" + water + '\'' +
                ", tea_powder='" + tea_powder + '\'' +
                ", sugar='" + sugar + '\'' +
                ", milk_powder='" + milk_powder + '\'' +
                '}';
    }
}
