import java.util.List;
import java.util.Scanner;

public class StudentList {
    public List<Student> studentList;

    StudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    void addStudent(){
        System.out.println("Enter the student's name and surname:");
        Scanner scan = new Scanner(System.in);
        String nameAndSurname = scan.nextLine();
        int id;
        if(studentList == null)
        {
            id = 1;
        }else
        {
            Student tempStudent = studentList.get(studentList.size() - 1);
            id = tempStudent.getId() + 1;
        }
        studentList.add(new Student(id, nameAndSurname));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Student student : studentList) {
            str.append(student.toString()).append("\n\n\n");
        }
        return str.toString();
    }
}
