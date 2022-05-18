package com.ua.Book;

import com.ua.Publication;

import java.util.Objects;

public class Book extends Publication {
    public boolean isInteresting;
    public String language = "Ukrainian";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isInteresting == book.isInteresting && Objects.equals(language, book.language);
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
