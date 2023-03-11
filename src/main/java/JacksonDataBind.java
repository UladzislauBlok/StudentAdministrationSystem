import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path){
        ObjectMapper objectMapper = new ObjectMapper();

        Student student = null;
        try {
            student = objectMapper.readValue(new File(path), Student.class);
        } catch (IOException e) {
            System.out.println("Parsing error" + e.toString());
        }

        System.out.println(student.toString());
    }
}
