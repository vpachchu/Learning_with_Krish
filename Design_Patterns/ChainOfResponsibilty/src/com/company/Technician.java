package com.company;

public class Technician extends  Handler{
    @Override
    public int applyPriority(Priority priority) {
        if(priority.getPriority()<3)
        {
            return priority.getPriority();
        }
        else
        {
            return successor.applyPriority(priority);
        }
    }
}
