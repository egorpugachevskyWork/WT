package by.bsuir.WT.lab1.task12;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Master and Margarite", "Bulgakov", 23000);
        Book book2 = new Book("gulag archipelago", "Aleksandr Solzhenitsyn", 1000);
        Book book3 = new Book("Master and Margarite", "Bulgakov", 23000);

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
