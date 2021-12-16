package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Offers {

    protected List<Gift> gifts=new ArrayList<>();

    public Offers()
    {
        createOffer();
    }

    protected abstract void createOffer();

    @Override
    public String toString() {
        return "Offers{" +
                "gifts=" + gifts +
                '}';
    }
}
