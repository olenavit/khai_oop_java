package ua;



import ua.Book.Book;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        Book book1 = new HistoryBook(598, "Война и мир", "Русский", false, "Толстой", 19);
        Book book2 = new MysteryBook(398, "It", "English", true, "Stephen King", true);
        Book book3 = new ArtBook(765, "Harry Potter", "English", true, " J. K. Rowling", true);

        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println(library);
        library.sort((b1,b2)->{
            if(b1.getName().length()>b2.getName().length()) return 1;
            else if(b1.getName().length()<b2.getName().length()) return -1;
            else return 0;
        });

        System.out.println(library);
    }
}


