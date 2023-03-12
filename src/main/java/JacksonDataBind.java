import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class JacksonDataBind {
    public static LinkedList<Student> fromJson(String path){
        ObjectMapper objectMapper = new ObjectMapper();

        LinkedList<Student> studentList = null;
        try {
            studentList = objectMapper.readValue(new File(path), new TypeReference<>() {});
        } catch (IOException e) {
            System.out.println("Parsing error" + e);
        }
        return  studentList;
    }

    public static void toJson(LinkedList<Student> studentList, String path){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(path), studentList);
        } catch (IOException e) {
            System.out.println("Output in Json error" + e);
        }
    }
}
