package com.ua;

import com.ua.Book.Book;

public class MysteryBook extends Book {
    public boolean isInteresting = true;
    public String name = "Крик";

    public boolean isScary(){
        System.out.println("All mystery book are scary");
        return true;
    }
    @Override
    public String toString() {
        return "MysteryBook{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", name='" + name + '\'' +
                '}';
    }
}
