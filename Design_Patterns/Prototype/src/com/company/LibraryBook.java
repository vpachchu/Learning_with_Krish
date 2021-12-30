package com.company;

public class LibraryBook extends Books{
    private String bookNum;

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "bookNum='" + bookNum + '\'' +
                '}';
    }
}
