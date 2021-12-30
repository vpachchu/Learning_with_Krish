package com.company;

public class OnlineBooks extends Books{
    private String site;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "OnlineBooks{" +
                "site='" + site + '\'' +
                '}';
    }
}
