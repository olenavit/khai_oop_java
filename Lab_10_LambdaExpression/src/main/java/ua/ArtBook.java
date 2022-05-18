package ua;


import ua.Book.Book;

public class ArtBook extends Book {
    private boolean hasPictures;

    public ArtBook() {
    }

    public ArtBook(String author) {
        super(author);
    }

    public ArtBook(int numPages, String name, String language, boolean isInteresting, String author, boolean hasPictures) {
        super(numPages, name, language, isInteresting, author);
        this.hasPictures = hasPictures;
    }

    @Override
    public double cost() {
            return getNumPages()*2.4;
    }

    public static class publishingHouse{
        public String whereIsPublic;
    }



    public boolean getIsHasPictures() {
        return hasPictures;
    }

    public void setHasPictures(boolean hasPictures) {
        this.hasPictures = hasPictures;
    }

    @Override
    public String toString() {
        return "ArtBook{ Author = "+getAuthor()+", numberOfPages = " + getNumPages() + ", Name =  " + getName() + ", Language = " +
                getLanguage()+", IsInteresting = "+ getIsInteresting()+", hasPictures =  " + getIsHasPictures();
    }
}
