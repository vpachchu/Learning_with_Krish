package com.company;

public class Hostel {

    private static Hostel room;

    private Hostel() {


    }

    public static Hostel getRoom() {
        if(room==null)
        {
            synchronized (Hostel.class)
            {
                if (room == null) {
                    room = new Hostel();
                }
            }
        }
        return room;
    }
}
