public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList(JacksonDataBind.fromJson("src/main/resources/Student.json"));
        studentList.addStudent();
        System.out.println(studentList);
        JacksonDataBind.toJson(studentList.getStudentList(), "src/main/resources/Student.json");
    }
}