package com.company;

public class LowLevel extends  Handler{


    @Override
    public int applyPriority(Priority priority) {
        return successor.applyPriority(priority);
    }
}
