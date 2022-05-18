package ua;


import ua.Book.Book;

public class Main {
    public static void main(String[] args) {
        //анонимный класс, реализует метод интерфейса;
        Book book = new Book() {
            @Override
            public double cost() {
                //Method local inner class
                class SalesTax{

                    final double salesTax=1.3;

                }
                SalesTax salesTax= new SalesTax();
                return getNumPages()*20*salesTax.salesTax ;
            }
        };
        book.setNumPages(97);
        System.out.println(book.cost());

        //static nested class
        ArtBook.publishingHouse publishingHouse = new ArtBook.publishingHouse();
        publishingHouse.whereIsPublic="Ranok";
        System.out.println(publishingHouse.whereIsPublic);
        int a=0;
        int b=9;

    }
}


