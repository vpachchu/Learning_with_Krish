package com.company;

public class Demo {

    static {
        System.out.println("Hi! I'm static01 block");
    }

    Demo()
    {
        System.out.println("Hi! I'm a constructor");
    }

    {
        System.out.println("Hi! I'm empty block");
    }

    static {
        System.out.println("Hi! I'm static02 block");
    }


}
