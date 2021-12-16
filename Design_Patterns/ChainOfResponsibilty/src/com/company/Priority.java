package com.company;

public class Priority {
    private int priority;
    public String person;

    public Priority(int priority) {
        this.priority=priority;
    }

    protected void setPriority(int priority)
    {

    }

    public int getPriority() {
        return priority;
    }

    public String getPerson() {
        return person;
    }
}
