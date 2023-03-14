import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter your login and press <Enter>: ");
        String login = scan.nextLine();
        System.out.println("\nEnter your password and press <Enter>: ");
        String password = scan.nextLine();
        if(login.equals("DeansOffice")){ // In the if block we process the authorization of the Dean's Office
            try{
                File file = new File("src/main/resources/DeansOfficePassword.txt");
                try(BufferedReader br = new BufferedReader(new FileReader(file))){  // Copy the password for the dean's office from the txt file
                String passwordDeansOffice = br.readLine();
                if(password.equals(passwordDeansOffice)){ // Compare it with the entered password
                    DeansOfficeLogin.makesOperation();
                }
                else{
                    System.out.println("\nIncorrect password\n");
                }
            }}
            catch (IOException e){
                System.out.println("File DeansOfficePassword.txt is not available: " + e); // In the catch block we handle errors of opening the file with the password(DeansOfficePassword.txt)
            }
        }else{ // In the else block we process the student's authorization
            StudentList studentList = new StudentList();
            boolean isFoundStudent = false;
            for(int count = 0; count < studentList.getStudentList().size(); count++){ // Looking for a student by checking each element of studentList
                if(login.equals(studentList.getStudentList().get(count).getEmail())){ // Check email(login)
                    if(password.equals(studentList.getStudentList().get(count).getPassword())) { // Check password
                        StudentLogin.makesOperation(count);
                        isFoundStudent = true; //   We let the student do the operations. Switch the isFountStudent flag to true
                        break;
                    }else{
                        System.out.println("\nIncorrect password\n");
                    }
                }
            }
            if(!isFoundStudent){ // If the student is not found (we have processed the Dean's Office authorization beforehand) - print the information that the login was writed incorrectly
                System.out.println("Incorrect login");
            }
        }
    }
}