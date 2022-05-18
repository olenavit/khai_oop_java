package ua.Book;

import ua.Publication;

import java.util.Objects;

public class Book extends Publication {
    public boolean isInteresting;

    public Book() {
    }

    public Book(int numPages, String name, String language, boolean isInteresting) {
        super(numPages, name, language);
        this.isInteresting = isInteresting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isInteresting == book.isInteresting && Objects.equals(language, book.language);
    }

    public boolean isInteresting() {
        return isInteresting;
    }

    public void setInteresting(boolean interesting) {
        isInteresting = interesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isInteresting, language);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numPages=" + numPages +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isInteresting=" + isInteresting +
                ", language='" + language + '\'' +
                '}';
    }
}
