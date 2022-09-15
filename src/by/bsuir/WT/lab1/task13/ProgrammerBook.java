package by.bsuir.WT.lab1.task13;

import by.bsuir.WT.lab1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          String language, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String toString(){
        return "Title: " + this.getTitle() + " Author: " + getAuthor() + " Price: " + getPrice() + " lang: " + language + " lvl: " + level +" v" + getEdition();
    }

    public boolean equals(Object obj){
        ProgrammerBook anotherBook = (ProgrammerBook)obj;
        if (this.getTitle().equals(anotherBook.getTitle()) &&
                this.getAuthor().equals(anotherBook.getAuthor()) &&
                this.getPrice() == anotherBook.getPrice() &&
                this.language.equals(anotherBook.language) &&
                this.level == anotherBook.level){
            return true;
        }

        return false;
    }

    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + getTitle().hashCode();
        hash = 53 * hash + getPrice();
        hash = 53 * hash + getAuthor().hashCode();
        hash += 53 * hash + getEdition();
        hash = 53 * hash + language.hashCode();
        hash = 53 * hash + level;
        return hash;
    }
}
