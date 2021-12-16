package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TeaTelescopic1 teaTelescopic1=new TeaTelescopic1("500ml","250g","250g");
        System.out.println(teaTelescopic1);

        TeaTelescopic2 teaTelescopic2=new TeaTelescopic2("100ml","150g");
        System.out.println(teaTelescopic2);

        Tea.Builder builder=new Tea.Builder("900ml");
        Tea tea=builder.tea_powder("650g").milk_powder("850g").build();
        System.out.println(tea);










    }
}
