import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class fileExample {
    public static void main (String[] args) throws IOException{
        var filename = "student.txt";
        var studentFile  = Paths.get(filename);
        var allStudent  = Files.readString(studentFile);
        String [] separatedNames = allStudent.split("\n");
        // now lets show the user
        System.out.println("Here are the student in your class: ");
        for(var studentName: separatedNames){
            System.out.println(studentName);
        }

    }
}
