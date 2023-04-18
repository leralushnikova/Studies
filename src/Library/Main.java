package Library;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        Library[] person = new Library[n];
        person[0] = new Library("Hermon", "29.04.1999",
                "89565465886");
        person[0].takeBook(5);
        person[0].returnBook(5);
        person[0].takeBook("Пушкин", "Лермонтов", "Достоевский");
        person[0].returnBook("Пушкин", "Лермонтов", "Достоевский");
        System.out.println(person[0].getId());
        person[1] = new Library("Лариса", "29.04.1956",
                "89565458886");
        person[1].takeBook(5);
        person[1].returnBook(5);
        person[1].takeBook("География", "Математика", "Словарь");
        person[1].returnBook("География", "Математика", "Словарь");
        System.out.println(person[1].getId());
        System.out.println(Library.Stat.counter);
    }
}
