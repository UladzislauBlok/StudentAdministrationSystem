import java.util.Scanner;

public class Student implements java.io.Serializable{
    Scanner scan =  new Scanner(System.in);
    private static int ID;
    private int id;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String address;
    private String email;
    private String phoneNum;
    private String faculty;
    private String group;
    private int course;

    Student(){

    }
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

    public int getId() {return id;}
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
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
        return "Student data: " + name + " " + surname + "\n" +
                "Date of birth: " + dateOfBirth + "\n" +
                "Home Address: " + address + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phoneNum + "\n" +
                "Faculty: " + faculty + "\n" +
                "Group: " + group + "\n" +
                "Course: " + course + "\n";
    }
}
