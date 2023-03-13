import java.util.Scanner;

public class StudentLogin {
    public static void makesOperation(final int index){
        StudentList studentList = new StudentList();
        Scanner scan = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("\nWhat kind of operation do you want to perform?\n" +
                    "1) Print my information\n" +
                    "2) Change password\n" +
                    "3) Send a request to the dean's office\n" +
                    "4) Save changes and exit\n" +
                    "Enter the operation number and press <Enter>: \n");
            int operationNum = scan.nextInt();
            switch (operationNum){
                case 1:{
                    System.out.println(studentList.getStudentList().get(index).toString());
                    break;
                }
                case 2:{
                    studentList.getStudentList().get(index).setEmailPasswordByUser();
                    break;
                }
                case 3:{
                    studentList.getStudentList().get(index).setRequest();
                    break;
                }
                case 4:{
                    studentList.saveChanges();
                    break OUT;
                }
            }
        }
    }
}
