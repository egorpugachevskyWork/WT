package by.bsuir.WT.lab1.task13;

import by.bsuir.WT.lab1.task12.Book;

public class Main {
    public static void main(String[] args){
        ProgrammerBook book1 = new ProgrammerBook("Master and Margarite", "Bulgakov", 23000, "English", 200);
        ProgrammerBook book2 = new ProgrammerBook("gulag archipelago", "Aleksandr Solzhenitsyn", 1000, "Swedish", 100);
        ProgrammerBook book3 = new ProgrammerBook("Master and Margarite", "Bulgakov", 23000, "English", 200);

        System.out.println("Book1: ");
        System.out.println("Hash code: " + book1.hashCode() + "\nInfo: " + book1.toString());

        System.out.println("Book2: ");
        System.out.println("Hash code: " + book2.hashCode() + "\nInfo: " + book2.toString());

        System.out.println("Book1 equals Book3:");
        System.out.println(book1.equals(book3));

        System.out.println("Book2 equals Book3:");
        System.out.println(book2.equals(book3));
    }
}
