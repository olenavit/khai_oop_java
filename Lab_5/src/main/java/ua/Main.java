package ua;


import ua.Book.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. тотожне (identity);
        ArtBook artBook = new ArtBook();
        artBook.setNumPages(25);
        int a = artBook.getNumPages();
        System.out.println(a);
        //2. розширення примітивного типу (widening primitive);
        double b = artBook.getNumPages();
        System.out.println(b);
        //3. звуження примітивного типу (narrowing primitive);
        short c = (short) artBook.getNumPages();
        //4. розширення об'єктного типу (widening reference);
            Book book1 = new MysteryBook();
        //5. звуження об'єктного типу (narrowing reference);
        Book book2 = new HistoryBook();
        if (book2 instanceof HistoryBook) {
            HistoryBook historyBook = (HistoryBook) book2;
        }
        //6. перетворення до рядка (String);
        Publication magazine = new Magazine(125,"Times","English", false);
        System.out.println(magazine);

    }
}


