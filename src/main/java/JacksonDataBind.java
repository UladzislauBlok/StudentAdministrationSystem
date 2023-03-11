import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonDataBind {
    public static List<Student> fromJson(String path){
        ObjectMapper objectMapper = new ObjectMapper();

        List<Student> studentList = null;
        try {
            studentList = objectMapper.readValue(new File(path), new TypeReference<List<Student>>(){});
        } catch (IOException e) {
            System.out.println("Parsing error" + e);
        }
        return  studentList;
    }

    public static void toJson(List<Student> studentList, String path){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(path), studentList);
        } catch (IOException e) {
            System.out.println("Output in Json error" + e);
        }
    }
}
