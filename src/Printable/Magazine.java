package Printable;
import java.util.Objects;

public class Magazine implements Printable{
    private String name;
    private Printable[] printables;

    public Magazine(String name) {
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
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Печатаем журнал  " + name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if(printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
