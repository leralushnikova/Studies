package Printable;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1");
        Book book2 = new Book("book2");
        Magazine magazine1 = new Magazine("magazine1");
        Magazine magazine2 = new Magazine("magazine2");
        Magazine magazine3 = new Magazine("magazine3");
        Printable[] printables = {book1, book2, magazine1, magazine2, magazine3};

        Book.printBooks(printables);
        //Magazine.printMagazines(printables);

    }
}
