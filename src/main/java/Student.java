import java.util.Scanner;

public class Student implements java.io.Serializable{
    Scanner scan =  new Scanner(System.in);
    private static int ID;
    private final int id;
    private final String name;
    private final String surname;
    private final String dateOfBirth;
    private String address;
    private String email;
    private String phoneNum;
    private String faculty;
    private String group;
    private int course;
    Student(String name, String surname, String dateOfBirth){
        ID++;
        id = ID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        setEmail();
        setAddress();
        setPhoneNum();
        setFaculty();
        setGroup();
        setCourse();
    }
    Student(int id, String name, String surname, String dateOfBirth, String address,
            String email, String phoneNum, String faculty, String group, int course){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
    }

    void setAddress() {
        System.out.println("Enter the student's address: ");
        address = scan.nextLine();
    }
    void setEmail() {
    EmailGenerator generator = new EmailGenerator();
    email = generator.generateEmail(name, surname);
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

    String getAddress() { return address; }
    int getId() {return id;}

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Student data: ").append(name).append(" ").append(surname).append("\n")
                .append("Date of birth: ").append(dateOfBirth).append("\n")
                .append("Home Address: ").append(address).append("\n")
                .append("Email: ").append(email).append("\n")
                .append("Phone number: ").append(phoneNum).append("\n")
                .append("Faculty: ").append(faculty).append("\n")
                .append("Group: ").append(group).append("\n")
                .append("Course: ").append(course).append("\n");

        return s.toString();
    }
}
