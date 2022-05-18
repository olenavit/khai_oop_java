package ua.Book;

import ua.Publication;

public abstract class Book extends Publication implements BookPrinting{
    public boolean isInteresting;

    public Book() {
    }

    public Book(int numPages, String name, String language, boolean isInteresting) {
        super(numPages, name, language);
        this.isInteresting = isInteresting;
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

    public boolean isInteresting() {
        return isInteresting;
    }

    public void setInteresting(boolean interesting) {
        isInteresting = interesting;
    }

}
