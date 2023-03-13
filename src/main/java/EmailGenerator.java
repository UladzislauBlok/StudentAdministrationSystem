import java.lang.Math;
public class EmailGenerator {
    private final static String universityDomain = "uw.bobrujsk.com";
    private final static int lengthPassword = 12;
    String generateEmail(String nameAndSurname){
        String baseMail = "";
        for (int count = 0; count < nameAndSurname.length(); count++){
            if(nameAndSurname.charAt(count) != ' ') {
                baseMail += nameAndSurname.toLowerCase().charAt(count);
            }
        }
        String mail = baseMail+ "@" + universityDomain;
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
}
