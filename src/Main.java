import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "Text.txt"; // filePath = "C:\Users\gqous\IdeaProjects\FileWriter"; this would work too
        String fileContent = """
                I am Gaoussou
                I want to master Java
                And become an App Developer!!!
                """;
        String initials = "GD";
        try (FileWriter file = new FileWriter(filePath)){
            file.write(fileContent);
            file.append(initials); // to add to the file without deleting the already written contents
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("File has not been written");
        }
    }
}