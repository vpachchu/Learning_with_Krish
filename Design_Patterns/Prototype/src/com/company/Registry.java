package com.company;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<BookType,Books> books=new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Books getBook(BookType bookType)
    {
        Books books=null;
      try {
         books=(Books) books.get(bookType).clone();
      } catch (Exception e) {
          e.printStackTrace();
      }

        return books;
    }

    private void initialize() {

        OnlineBooks b1=new OnlineBooks();
        b1.setType("Story");
        b1.setPages(30);
        b1.setSite("www.dragontales.com");
        b1.setISBN("ISBN100123");

        PurchaseBook b2=new PurchaseBook();
        b2.setType("English Grammar");
        b2.setPages(300);
        b2.setISBN("ISBN200134");
        b2.setPrice(450);

        LibraryBook b3=new LibraryBook();
        b3.setType("Novel");
        b3.setPages(700);
        b3.setISBN("ISBN25673");
        b3.setBookNum("BN00891");

        books.put(BookType.OnlineBooks, b1);
        books.put(BookType.PurchaseBooks,b2);
        books.put(BookType.LibraryBooks,b2);

    }


}
