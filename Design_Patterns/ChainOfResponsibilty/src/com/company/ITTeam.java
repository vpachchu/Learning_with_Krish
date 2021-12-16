package com.company;

public class ITTeam extends  Handler{
    @Override
    public int applyPriority(Priority priority) {
        if(priority.getPriority()<2)
        {
            return priority.getPriority();
        }
        else
        {
            return successor.applyPriority(priority);
        }
    }
}
