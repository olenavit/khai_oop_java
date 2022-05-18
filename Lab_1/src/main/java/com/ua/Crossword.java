package com.ua;

import java.util.Objects;

public class Crossword extends Publication {
    public int numPages = 21;
    public boolean isHard = false;

    public boolean hasAnegdot(){
        return super.cost()>200;
    }

    @Override
    public String toString() {
        return "Crossword{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", numPages=" + numPages +
                ", isHard=" + isHard +
                '}';
    }
}
