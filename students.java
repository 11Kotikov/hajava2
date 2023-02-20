import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class students {
    // Написать метод(ы), который распарсит строку и, используя StringBuilder,
    // создаст строки вида:
    // Студент [фамилия] получил [оценка] по предмету [предмет].
    public static void main(String[] args) throws Exception {
        File file = new File("my_students.txt");
        try {
            FileReader f = new FileReader(file);
            BufferedReader reader = new BufferedReader(f);
            String line = reader.readLine();
            while (line != null) {
                System.out.print(studentsInfo(line));
                line = reader.readLine();
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Что то не так");
        }
    }

    public static StringBuilder studentsInfo(String line) {
        String newLine;
        newLine = line.replaceAll("\"", "");
        newLine = newLine.replaceAll(":", ",");
        newLine = newLine.replaceAll(",", " ,");

        StringBuilder resultLine = new StringBuilder("\nStudent ");
        String[] problemLine = newLine.split(",");

        resultLine.append(problemLine[1]);
        resultLine.append("has ");
        resultLine.append(problemLine[3]);
        resultLine.append("and his subject is ");
        resultLine.append(problemLine[5]);

        return resultLine;

    }
}
