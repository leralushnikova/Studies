package Printable;

import java.util.Objects;

public class Book implements Printable{
    private String name;
    private Printable[] printables;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Печатаем книгу " + name);
    }
    public static void printBooks(Printable[] printables) {
        System.out.println("Printing books: ");
        for (Printable printable : printables) {
            if(printable instanceof Book) {
                Book book = (Book) printable;
                System.out.println(book.getName());
            }
        }
    }
}
