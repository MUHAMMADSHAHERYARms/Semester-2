package basics;
import java.nio.file.*;

public class FileReading {
    public static void main(String[] args) throws Exception {
     String content = Files.readString(Path.of("C:\\\\Users\\\\NEW\\\\Desktop\\\\second sem\\\\sampleForQuizExam.txt"));
       System.out.println(content);
   //String content = Files.readString(Path.of("C:\\\\\\\\Users\\\\\\\\NEW\\\\\\\\Desktop\\\\\\\\second sem\\\\\\\\sampleForQuizExam.txt"));
      String[] words = content.split("\\s+"); // split by space
//        for (String w : words) {
//            System.out.println(w);
        // prints each word in next line


    }
}
