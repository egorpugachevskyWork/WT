package by.bsuir.WT.lab1.task15;

import by.bsuir.WT.lab1.task12_14.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        int authorCompare = book1.getAuthor().compareTo(book2.getAuthor());
        int priceCompare = intCompare(book1.getPrice(), book2.getPrice());

        if (authorCompare == 0){
            if (titleCompare == 0) {
                return priceCompare;
            }
            else {
                return titleCompare;
            }
        }
        return authorCompare;

    }

    private int intCompare(int a, int b){
        if (a > b) return 1 ;
        else if (a < b) return -1;
        return 0;
    }
}