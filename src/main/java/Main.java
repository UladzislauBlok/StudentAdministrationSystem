public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList(JacksonDataBind.parseJson("src/main/resources/Student.json"));
        studentList.addStudent();
        System.out.println(studentList);
    }
}