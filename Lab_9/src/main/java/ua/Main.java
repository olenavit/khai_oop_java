package ua;


import ua.Book.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> bookMap= new HashMap<>() ;
        Book book1 = new HistoryBook(598,"Война и мир", "Русский",false,"Толстой", 19);
        Book book2 = new MysteryBook(398,"It","English",true,"Stephen King",true);

        bookMap.put(book1,"Tolstoy");
        bookMap.put(book2, "Stephen King");

        System.out.println(getKeyByValue(bookMap,"Stephen King"));

    }
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}



