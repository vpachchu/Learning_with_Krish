package com.company;

public class CloudTeam extends  Handler{
    @Override
    public int applyPriority(Priority priority) {

        priority.setPriority(3);
        System.out.println("It is a severe issue");
        return priority.getPriority();
    }
}
