package com.ua;

public class Publication {
    public int numPages = 100500;
    public String name = "namePublications";
    public String language = " language";


    public double cost() {
        return numPages*2.5/100;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
