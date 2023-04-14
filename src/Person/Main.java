package Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Lushnikova Valeriya", 30);
        person1.move();
        person1.talk();
        System.out.println(person1.getFullName() + " " + person1.getAge()+" years old");
        Person person2 = new Person();
        person2.setFullName("Lushnikov Artem");
        person2.setAge(28);
        person2.move();
        person2.talk();
        System.out.println(person2.getFullName() + " " + person2.getAge()+" years old");
    }
}
