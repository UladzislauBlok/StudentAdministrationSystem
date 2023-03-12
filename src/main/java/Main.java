import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scan = new Scanner(System.in);
        OUT: while (true) {
            System.out.println("\nWhat kind of operation do you want to perform?\n" +
                    "1) Add Student\n" +
                    "2) Remove student\n" +
                    "3) Change student data\n" +
                    "4) Print student data\n" +
                    "5) Print out a list of students in a certain course\n" +
                    "6) Print out the entire student list\n" +
                    "7) Save changes to the list of students\n" +
                    "8) Save changes and exit\n" +
                    "Enter the operation number and press <Enter>: \n");
            int operationNum = scan.nextInt();
            switch (operationNum) {
                case 1: {
                    studentList.addStudent();
                    break;
                }
                case 2: {
                    studentList.removeStudent();
                    break;
                }
                case 3: {
                    studentList.changingStudentData();
                    break;
                }
                case 4: {
                    studentList.printStudent();
                    break;
                }
                case 5: {
                    studentList.printStudentCourseList();
                    break;
                }
                case 6: {
                    studentList.printStudentList();
                    break;
                }
                case 7: {
                    studentList.saveChanges();
                    break;
                }
                case 8: {
                    studentList.saveChanges();
                    break OUT;
                }
            }
        }
    }
}