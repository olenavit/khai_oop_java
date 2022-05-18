package ua.com.ua;


import ua.com.ua.Book.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Publication publication=new Publication();
//        System.out.println(publication);
//        Book book1=new Book();
//        System.out.println(book1);
//        ArtBook artBook=new ArtBook();
//        System.out.println(artBook);
//        Magazine magazine=new Magazine();
//        System.out.println(magazine);

            Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i]= sc.nextInt();
        }

        for (int i = 0; i < mas.length-1; i+=2) {
            int temp= mas[i];
            mas[i]=mas[i+1];
            mas[i+1]=temp;

        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
        }
    }



