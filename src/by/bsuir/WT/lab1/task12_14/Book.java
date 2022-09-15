package by.bsuir.WT.lab1.task12_14;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 0;


    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = edition;
        edition++;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
    public int getIsbn() { return isbn; }
    public static int getEdition() { return edition; }
    public static void setEdition(int number) { edition = number; }

    public String toString(){
        return "Title: " + title + " Author: " + author + " Price: " + price + " isbn: " + isbn;
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
        return hash;
    }

    public int compareTo(Book obj){
        if (this.isbn > obj.isbn)
            return 1;
        else if (this.isbn < obj.isbn)
            return -1;

        return 0;
    }

    public Object clone(){
        Book book = null;
        book = new Book(this.title, this.author, this.price);
        return book;
    }
}
