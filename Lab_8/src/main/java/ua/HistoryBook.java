package ua;


import ua.Book.Book;

public class HistoryBook extends Book {
    public int century;

    public HistoryBook() {
    }

    public HistoryBook(int numPages, String name, String language, boolean isInteresting, int century) {
        super(numPages, name, language, isInteresting);
        this.century = century;
    }

    public double cost(){
        return isOld()?numPages*6+50:numPages*6;
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
