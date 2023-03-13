import java.util.Scanner;

public class DeansOfficeLogin {
    public static void makesOperation() {
        StudentList studentList = new StudentList();
        Scanner scan = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("\nWhat kind of operation do you want to perform?\n" +
                    "1) Add Student\n" +
                    "2) Remove student\n" +
                    "3) Change student data\n" +
                    "4) Print student data\n" +
                    "5) Print all requests from students\n" +
                    "6) Print out a list of students in a certain course\n" +
                    "7) Print out the entire student list\n" +
                    "8) Save changes\n" +
                    "9) Save changes and exit\n" +
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
                case 5:{
                    studentList.printRequest();
                    break;
                }
                case 6: {
                    studentList.printStudentCourseList();
                    break;
                }
                case 7: {
                    studentList.printStudentList();
                    break;
                }
                case 8: {
                    studentList.saveChanges();
                    break;
                }
                case 9: {
                    studentList.saveChanges();
                    break OUT;
                }
                default: {
                    System.out.println("\nUnknown operation\n");
                }
            }

        }
    }
}
