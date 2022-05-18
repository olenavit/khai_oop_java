package ua.Book;

import ua.Publication;

public abstract class Book extends Publication implements BookPrinting{
    private boolean isInteresting;
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(int numPages, String name, String language, boolean isInteresting, String author) {
        super(numPages, name, language);
        this.isInteresting = isInteresting;
        this.author = author;
    }

    private class BookContent{
        private void showContent(){
            System.out.println("Content of Book: ...");
        }
    }

    public void showBookAnnotation(){
        BookContent bookContent = new BookContent();
        bookContent.showContent();
        System.out.println(getName());
        System.out.println(getLanguage());
    }

    public abstract String getClassName();
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsInteresting() {
        return isInteresting;
    }

    public void setInteresting(boolean interesting) {
        isInteresting = interesting;
    }

}
