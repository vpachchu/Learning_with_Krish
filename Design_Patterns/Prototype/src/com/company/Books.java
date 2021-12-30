package com.company;



public abstract class Books implements Cloneable{
    private String ISBN,type;
    private int pages;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
