package lambda_expressions;

import java.util.ArrayList;

public class StudentsInfo3 {
    void printStudent3(Students3 st){
        System.out.println("Students3{" +
                "name='" + st. name + '\'' +
                ", surname='" + st.surname + '\'' +
                ", age=" + st.age +
                ", course=" + st.course +
                ", averageGrade=" + st.averageGrade +
                ", sex=" + st.sex +
                '}');
    }
    void checkStudents3(ArrayList <Students3>arrayList, TestStudent3 ts){
        for(Students3 st: arrayList){
            if(ts.test(st)){
                printStudent3(st);
            }
        }
    }
    public static void main(String[] args) {

        Students3 stud1 = new Students3("Vasia","Pupkin", 20, 3,8.0,'m');
        Students3 stud2 = new Students3("Ira","Guza", 18, 1,9.2,'f');
        Students3 stud3 = new Students3("Dima","Rura", 23, 5,6.5,'m');
        Students3 stud4 = new Students3("Nastia","Fifa", 24, 4,5.9,'f');
        Students3 stud5 = new Students3("Igor","Biaka", 19, 2,7.0,'m');
        ArrayList<Students3> al3 = new ArrayList<>();

        al3.add(stud1);
        al3.add(stud2);
        al3.add(stud3);
        al3.add(stud4);
        al3.add(stud5);
        StudentsInfo3 si = new StudentsInfo3();
        si.checkStudents3(al3,s -> s.age>20);
        System.out.println("--------------------------");
        si.checkStudents3(al3,s -> s.averageGrade>8.0);
        System.out.println("--------------------------");
        si.checkStudents3(al3,s -> s.course<3);

    }
}
interface TestStudent3{
    boolean test(Students3 s);
}