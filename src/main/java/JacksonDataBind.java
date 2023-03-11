import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonDataBind {
    public static List<Student> parseJson(String path){
        ObjectMapper objectMapper = new ObjectMapper();

        List<Student> studentList = null;
        try {
            studentList = objectMapper.readValue(new File(path), new TypeReference<List<Student>>(){});
        } catch (IOException e) {
            System.out.println("Parsing error" + e.toString());
        }

        return  studentList;
    }
}
