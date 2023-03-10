import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
public class EmailGenerator {
    private static String universityDomain = "uw.bobrujsk.com";
    private final static int lengthPassword = 12;
    String generateEmail(String name, String surname){
        String mail = name.toLowerCase() + "." + surname.toLowerCase() + "@" + universityDomain;
        String password = generatePassword();
        writeToFile(mail, password);
        return mail;
    }
    String generatePassword(){
        String symbolPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&";
        char[] tempPassword = new char[lengthPassword];
        for(int count = 0; count < lengthPassword; count++)
        {
            int rand = (int) (Math.random() * symbolPassword.length());
            tempPassword[count] = symbolPassword.charAt(rand);
        }
        return new String(tempPassword);
    }
    void writeToFile(String email, String password) {
        String filePath = "src/main/resources/Email - Password.txt";
        try(FileWriter writer = new FileWriter(filePath, true))
        {
            writer.write(email + " ----- " + password + "\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println("File(Email - Password.txt) opening error");
        }
    }
    public static void changeUniversityDomain(String newDomain) {
        universityDomain = newDomain;
    }
}
