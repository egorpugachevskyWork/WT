package by.bsuir.WT.lab1.task12_14;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Master and Margarite", "Bulgakov", 23000);
        Book book3 = new Book("Master and Margarite", "Bulgakov", 23000);
        Book book2 = new Book("gulag archipelago", "Aleksandr Solzhenitsyn", 1000);
        Book book4 = (Book) book2.clone();

       // DisplayTask12(book1, book2, book3);
        DisplayTask14(book1, book2, book3, book4);

    }

    private static void DisplayTask12(Book book1, Book book2, Book book3){
        System.out.println("Task12");
        System.out.println("-------------------------------------------------");
        System.out.println("Book1 : ");
        System.out.println("Hash code : " + book1.hashCode() + "\nInfo: " + book1.toString());

        System.out.println("Book2 : ");
        System.out.println("Hash code : " + book2.hashCode() + "\nInfo: " + book2.toString());

        System.out.println("Book1 equals Book3:");
        System.out.println(book1.equals(book3));

        System.out.println("Book2 equals Book3:");
        System.out.println(book2.equals(book3));
        System.out.println("-------------------------------------------------");
    }

    private static void DisplayTask14(Book book1, Book book2, Book book3, Book book4){
        System.out.println("Task14");
        System.out.println("-------------------------------------------------");

        System.out.println("Book4 equals Book2:");
        System.out.println(book4.equals(book2));

        System.out.println("Not sorted: ");
        List<Book> books = new ArrayList<Book>(Arrays.asList(book4, book1, book2, book3));
        for (Book book : books){
            System.out.println(book.toString());
        }
        Collections.sort(books);
        System.out.println("Sorted: ");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
}
