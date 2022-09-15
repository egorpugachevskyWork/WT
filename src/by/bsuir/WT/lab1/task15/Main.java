package by.bsuir.WT.lab1.task15;

import by.bsuir.WT.lab1.task12_14.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Cde", "Egor", 2),
                new Book("Bde","Anton", 4),
                new Book("Bde", "Anton", 1),
                new Book("Ade", "Anton", 10)
        ));

        System.out.println("Default: ");
        DisplayBooks(books);

        Collections.sort(books, new AuthorTitleComparator());
        System.out.println("Author->Title sorted: ");
        DisplayBooks(books);

        Collections.sort(books, new TitleAuthorComparator());
        System.out.println("Title->Author sorted: ");
        DisplayBooks(books);

        Collections.sort(books, new AuthorTitlePriceComparator());
        System.out.println("Title->Author->Price sorted: ");
        DisplayBooks(books);

    }

    private static void DisplayBooks(List<Book> books){
        for (Book book : books){
            System.out.println(book.toString());
        }
        System.out.println();
    }
}
