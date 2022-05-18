package ua;


import ua.Book.Book;


public class MysteryBook extends Book {
    boolean isScary;

    public MysteryBook() {
    }

    public MysteryBook(int numPages, String name, String language, boolean isInteresting, boolean isScary) {
        super(numPages, name, language, isInteresting);
        this.isScary = isScary;
    }

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
