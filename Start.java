import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("a", 18));
        students.add(new Student("c", 19));
        students.add(new Student("b", 20));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()>o2.getAge()? -1:(o1.getAge()==o2.getAge()? 0:1);
            }
        });
        for(Student student:students){
            System.out.println(student.toString());
        }
    }
}
//ookk
