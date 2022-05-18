package ua;


import ua.Book.Book;

public class HistoryBook extends Book {
    private int century;

    public HistoryBook() {
    }

    public HistoryBook(int numPages, String name, String language, boolean isInteresting, String author, int century) {
        super(numPages, name, language, isInteresting, author);
        this.century = century;
    }

    public String getClassName(){
        return "HistoryBook";
    }
    public boolean isOld() {
        return century <= 18;
    }

    public int getCentury() {
        return century;
    }

    public void setCentury(int century) {
        this.century = century;
    }

    @Override
    public double cost() {
        return isOld() ? getNumPages() * 10 + 80 : getNumPages() * 10;
    }

    @Override
    public String toString() {

        return "HistoryBook{ Author = "+getAuthor()+",numberOfPages = " + getNumPages() + ", Name =  " + getName() + ", Language = " +
                getLanguage()+", IsInteresting = "+ getIsInteresting()+", Century =  " + getCentury()+" }";
    }
}
