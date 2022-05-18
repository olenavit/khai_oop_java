package com.ua;

public class Magazine extends Publication {
    public String name = "Times";
    public boolean hasSudoku = false;

    public double cost(){
        return hasSudoku?super.cost()+25:super.cost();
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", hasSudoku=" + hasSudoku +
                '}';
    }
}
