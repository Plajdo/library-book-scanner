package com.unaux.plasmoxy.libscan.database;

import es.esy.playdotv.objects.Book;

public class DatabaseTESTER
{ 
    LBSDatabase db = LBSDatabase.getInstance();
    
    public static void main(String[] args)
    {
        LBSDatabase db = LBSDatabase.getInstance();
        
        db.books.put("1", new Book("1", "Seb", "LOLO"));
        db.books.put("2", new Book("2", "Filip", "ass"));
        db.books.put("3", new Book("3", "Testova�n� Diakriti�ka", "Suka B�ja�ov�"));
        
        db.save("testDatabase.xml");
        
    }
}
