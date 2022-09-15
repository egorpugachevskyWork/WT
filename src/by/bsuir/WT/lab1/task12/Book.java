package by.bsuir.WT.lab1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition = 1;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return "Title: " + title + " Author: " + author + " Price: " + price + " v" + edition;
    }

    public boolean equals(Object obj){
        Book anotherBook = (Book)obj;
        if (this.title.equals(anotherBook.title) &&
            this.author.equals(anotherBook.author) &&
            this.price == anotherBook.price){
            return true;
        }

        return false;
    }

    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + title.hashCode();
        hash = 53 * hash + price;
        hash = 53 * hash + author.hashCode();
        hash += edition;
        return hash;
    }
}
