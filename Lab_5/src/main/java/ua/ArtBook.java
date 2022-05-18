package ua;


import ua.Book.Book;

public class ArtBook extends Book {
    boolean hasPictures;

    public ArtBook() {
    }

    public ArtBook(int numPages, String name, String language, boolean isInteresting, boolean hasPictures) {
        super(numPages, name, language, isInteresting);
        this.hasPictures = hasPictures;
    }

    @Override
    public double cost() {
        return hasPictures? super.cost()+80:super.cost();
    }


    public boolean isHasPictures() {
        return hasPictures;
    }

    public void setHasPictures(boolean hasPictures) {
        this.hasPictures = hasPictures;
    }

    @Override
    public String toString() {
        return "ArtBook{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", language='" + language + '\'' +
                ", numPages=" + numPages +
                ", isInteresting=" + isInteresting +
                ", hasPictures=" + hasPictures +
                '}';
    }
}
