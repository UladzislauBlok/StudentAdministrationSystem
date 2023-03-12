import java.util.Scanner;

public class Student implements java.io.Serializable{
    Scanner scan =  new Scanner(System.in);
    private int id;
    private String nameAndSurname;
    private String dateOfBirth;
    private String address;
    private String email;
    private String phoneNum;
    private String faculty;
    private String group;
    private int course;

    Student(){
    }
    Student(int id, String nameAndSurname){
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        setDateOfBirth();
        setEmail();
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
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getGroup() {
        return group;
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
