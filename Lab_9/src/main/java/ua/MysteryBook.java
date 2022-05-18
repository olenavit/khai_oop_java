package ua;
import ua.Book.Book;

public class MysteryBook extends Book {
    private boolean isScary;

    public MysteryBook() {
    }


    public MysteryBook(int numPages, String name, String language, boolean isInteresting, String author, boolean isScary) {
        super(numPages, name, language, isInteresting, author);
        this.isScary = isScary;
    }

    public boolean getIsScary() {
        return isScary;
    }

    public void setScary(boolean scary) {
        isScary = scary;
    }

    @Override
    public String toString() {
        return "MysteryBook{ Author = "+getAuthor()+",numberOfPages = " + getNumPages() + ", Name =  " + getName() + ", Language = " +
                getLanguage()+", IsInteresting = "+ getIsInteresting()+", isScary =  " + getIsScary()+" }";
    }

    @Override
    public double cost() {
        return getNumPages()*8;
    }
}
