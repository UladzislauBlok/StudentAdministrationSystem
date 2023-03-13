import java.util.Scanner;

public class Student implements java.io.Serializable{
    Scanner scan =  new Scanner(System.in);
    private int id;
    private String nameAndSurname;
    private String dateOfBirth;
    private String address;
    private String email;
    private String emailPassword;
    private String phoneNum;
    private String faculty;
    private String group;
    private String request;
    private int course;

    Student(){
    }
    Student(int id, String nameAndSurname){
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        setDateOfBirth();
        setEmail();
        setEmailPasswordByRand();
        setAddress();
        setPhoneNum();
        setFaculty();
        setGroup();
        setCourse();
    }
    void setDateOfBirth(){
        System.out.println("Enter the student's date of birth(dd/mm/yyyy)");
        dateOfBirth = scan.nextLine();
    }
    void setAddress() {
        System.out.println("Enter the student's address: ");
        address = scan.nextLine();
    }
    void setEmail() {
    EmailGenerator generator = new EmailGenerator();
    email = generator.generateEmail(nameAndSurname);
    }
    void setEmailPasswordByRand(){
        EmailGenerator generator = new EmailGenerator();
        emailPassword = generator.generatePassword();
    }
    void setEmailPasswordByUser(){
        String newPassword;
        String newPasswordRepeat;
        while(true){
            System.out.println("\nPassword must be 8 to 40 characters");
            System.out.println("\nEnter your password and press <Enter>:\n");
            newPassword = scan.nextLine();
            System.out.println("\nEnter your password again and press <Enter>:\n");
            newPasswordRepeat = scan.nextLine();
            if(newPassword.length() > 8 && newPassword.length() < 40 && newPassword.equals(newPasswordRepeat))
            {
                break;
            }
            else
            {
                System.out.println("\nPassword is not entered correctly\n");
            }
        }
        emailPassword = newPassword;
    }
    void setPhoneNum() {
        System.out.println("Enter the student's phone number: ");
        phoneNum = scan.nextLine();
    }
    void setFaculty() {
        System.out.println("Enter the student's faculty: ");
        faculty = scan.nextLine();
    }
    void setGroup(){
        System.out.println("Enter the student's group: ");
        group = scan.nextLine();
    }
    void  setRequest(){
        System.out.println("Enter your request in the Dean's Office and press <Enter>");
        request = scan.nextLine();
    }
    void cleanRequest(){
        request = null;
    }
    void setCourse() {
        System.out.println("Enter which course the student is in: ");
        course = scan.nextInt();
    }

    public int getId() {return id;}
    public String getNameAndSurname(){
        return nameAndSurname;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddress() { return address; }
    public String getEmail() {
        return email;
    }
    public String getEmailPassword() { return  emailPassword; }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getGroup() {
        return group;
    }
    public String getRequest() {
        return request;
    }
    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "\nStudent data of " + nameAndSurname + "\n" +
                "Id : " + id + "\n" +
                "Date of birth: " + dateOfBirth + "\n" +
                "Home Address: " + address + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phoneNum + "\n" +
                "Faculty: " + faculty + "\n" +
                "Group: " + group + "\n" +
                "Course: " + course + "\n";
    }
}
