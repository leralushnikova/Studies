package University;

public class Main {
    public static void main(String[] args) {
        final int n = 3;
        Student students[] = new Student[n];
        students[0] = new Student("Валерия", "Барсукова", "Фундаменты", 4.8);
        students[1] = new Aspirant("Валерия", "Спиранская", "Фундаменты", 5, "Жилые здания");
        students[2] = new Student("Артем", "Лушников", "Подземка", 3);
        for(Student student : students){
            System.out.println(student.getScholarship());
        }
       Aspirant aspirant = new Aspirant("Антон", "Фадеев", "ЖБК", 4.5, "Пром здания");
        System.out.println(aspirant.work);

    }
}
