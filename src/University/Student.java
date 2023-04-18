package University;

public class Student {
    private String firstName, lastName, group;
    double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return averageMark == 5 ? 1900 : 1500;
    }
}
