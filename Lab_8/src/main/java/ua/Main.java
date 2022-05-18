package ua;


import ua.Book.Book;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArtBook artBook = new ArtBook();
       artBook.setNumPages(Integer.parseInt(sc.nextLine()));
       if(artBook.getNumPages()<1){
           try {
               throw new IOException();
           } catch (IOException e) {
               System.out.println("Number pages of Book can't be < 1");;
           }
           finally {
               System.out.println("Input numOfPages");
               artBook.setNumPages(Integer.parseInt(sc.nextLine()));
           }
       }
        
    }
}


