import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {
    private LinkedList<Student> studentList;
    StudentList(){
        studentList = JacksonDataBind.fromJson("src/main/resources/Student.json");
    }
    private int findStudentById(){ // The function searches by id and returns the item number in the list.
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter student id: \n");
        int id = scan.nextInt();
        if(studentList != null && !studentList.isEmpty()) {
            for (int count = 0; count < studentList.size(); count++) {
                if (studentList.get(count).getId() == id) {
                    return count;
                }
            }
        }
        return -1; // If the student with the given id was not found, we return -1. In the calling method we check
    }
    public void printStudent(){
        int index = findStudentById();
        if (index == -1){
            System.out.println("\nStudent with the given id was not found\n");
        }else{
            System.out.println(studentList.get(index).toString());
        }
    }
    public void printRequest(){
        if(studentList != null && !studentList.isEmpty()){
            System.out.println("\nThere are requests from the following students:");
            for(int count = 0; count < studentList.size(); count++){
                if(studentList.get(count).getRequest() != null)
                {
                System.out.println(count + ") " + studentList.get(count).getNameAndSurname() + "\nId: "
                        + studentList.get(count).getId() + "\n" + studentList.get(count).getRequest() + ";\n");
            }
                studentList.get(count).cleanRequest();
            }
        }else{
            System.out.println("\nNot a single student has been added yet\n");
        }
    }
    public void printStudentCourseList(){
        System.out.println("\nEnter the course number and press <Enter>: \n");
        Scanner scan = new Scanner(System.in);
        int course = scan.nextInt();
        ArrayList<Student> studentCourseList = new ArrayList<>();
        if(studentList != null && !studentList.isEmpty()){
        for (Student student : studentList) {
            if (student.getCourse() == course) {
                studentCourseList.add(student);
            }
        }
        if(studentCourseList.size() == 0){
            System.out.println("\nNo students in this course were found\n");
        }else {
            for (Student student : studentCourseList) {
                System.out.printf(student.toString());
            }
        }}else{
            System.out.println("\nNot a single student has been added yet\n");
        }
    }
    public void printStudentList(){
        if(studentList != null && !studentList.isEmpty()){
            System.out.println(studentList);
        }else{
            System.out.println("\nNot a single student has been added yet\n");
        }
    }
    public void changingStudentData(){
        int index = findStudentById();
        if (index == -1){
            System.out.println("\nStudent with the given id was not found\n");
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println("What data do you want to change? \n" +
                                "1) Address\n" +
                                "2) Phone number\n" +
                                "3) Faculty\n" +
                                "4) Group\n" +
                                "5) Course\n" +
                                "Enter the operation number and press <Enter>: ");
            int operationNum = scan.nextInt();
            switch(operationNum){
                case 1:{
                    studentList.get(index).setAddress();
                    break;
                }
                case 2:{
                    studentList.get(index).setPhoneNum();
                    break;
                }
                case 3:{
                    studentList.get(index).setFaculty();
                    break;
                }
                case 4:{
                    studentList.get(index).setGroup();
                    break;
                }
                case 5:{
                    studentList.get(index).setCourse();
                    break;
                }
            }
            System.out.println("\nStudent data has been successfully changed\n");
        }
    }
    public void addStudent(){
        System.out.println("\nEnter the student's name and surname:");
        Scanner scan = new Scanner(System.in);
        String nameAndSurname = scan.nextLine();
        int id;
        if(studentList == null || studentList.isEmpty())
        {
            id = 1;
            studentList = new LinkedList<>();
        }else
        {
            Student tempStudent = studentList.get(studentList.size() - 1);
            id = tempStudent.getId() + 1;
        }
        studentList.add(new Student(id, nameAndSurname));
        System.out.println("\nStudent has been successfully added to the list\n");
    }
    public void removeStudent(){
        int index = findStudentById();
        if (index == -1){
            System.out.println("\nStudent with the given id was not found\n");
        }else{
            studentList.remove(index);
            System.out.println("\nThe student has been successfully expelled from the list\n");
        }
    }
    public void saveChanges(){
        JacksonDataBind.toJson(studentList,"src/main/resources/Student.json");
        System.out.println("\nChanges have been successfully saved\n");
    }
    public LinkedList<Student> getStudentList() {
        return studentList;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Student student : studentList) {
            str.append(student.toString());
        }
        return str.toString();
    }
}