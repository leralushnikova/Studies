package Library;

public class Library {
    private String fullName, dataBirthday, numberPhone;
    private int id;
    {
        Stat.counter++;
        id = ++Stat.id;
    }
    public Library(String fullName, String dataBirthday, String numberPhone) {
        this.fullName = fullName;
        this.dataBirthday = dataBirthday;
        this.numberPhone = numberPhone;

    }

    public int getId(){
        return id;
    }
    public void takeBook(int counter) {
        System.out.println(fullName + " took " + counter + " books");
    }

    public void takeBook(String... nameBook) {
        System.out.print(fullName + " took books: ");
        for (String n : nameBook) {
            System.out.print(n + ", ");
        }
        System.out.println();
    }

    public void returnBook(int counter){
        System.out.println(fullName + " returned " + counter + " books");
    }

    public void returnBook(String... nameBook) {
        System.out.print(fullName + " returned books: ");
        for (String n : nameBook) {
            System.out.print(n + ", ");
        }
        System.out.println();
    }
    static class Stat{
        public static int counter = 0;
        public static int id = 0;
    }
}
