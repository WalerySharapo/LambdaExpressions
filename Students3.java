package lambda_expressions;

public class Students3 {
    String name;
    String surname;
    int age;
    int course;
    double averageGrade;
    char sex;

    public Students3(String name, String surname, int age, int course, double averageGrade, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Students3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                ", sex=" + sex +
                '}';
    }
}