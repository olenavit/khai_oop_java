package com.ua;

import com.ua.Book.Book;

public class HistoryBook extends Book {
    public boolean isInteresting = false;
    public int century = 17;

    public double cost(){
        return isOld()?super.cost()+50:super.cost();
    }
    public boolean isOld(){
        return century <= 18;
    }
    @Override
    public String toString() {
        return "HistoryBook{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", century=" + century +
                '}';
    }
}
