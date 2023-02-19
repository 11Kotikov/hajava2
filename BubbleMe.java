import java.io.File;
import java.io.FileWriter;

// import java.io.FileReader;
// import java.lang.System.Logger;
// import javax.swing.text.html.HTMLEditorKit.Parser;
// import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового
// массива (введён вами), результат после каждой итерации запишите в лог-файл.

public class BubbleMe {
    public static void main(String[] args) {
        // Logger logger = Logger.getLogger(bubble_me.class.getName());
        // // ConsoleHandler ch = new ConsoleHandler();
        // // logger.addHandler(ch);
        // // SimpleFormatter sFormat = new SimpleFormatter();
        // // ch.setFormatter(sFormat);
        // // logger.log(Level.WARNING, "OH NOOOOOO!!!!");
        // // logger.info("just relax");
        // try {
        // bubbler();
        // } catch (Exception e) {
        // logger.info("Omg there's mistake");
        // } так и не понял можно ли это сделать с логгером, или он только ошибки
        // считывает...
        int[] someArray = { 543, 127, 56, 675, 3546, 6, 65, 5 };
        System.out.print("Your new sorted array is ");
        bubbler(someArray);
        printMyArray(someArray);
        System.out.print("\nHow Did I do this? Check the bubble_log.txt!");
    }


    public static void printMyArray(int [] myArray) {
        System.out.print("[");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.printf("%d, ", myArray[i]);
        }
        System.out.print("\b\b]");
    }

    public static int[] bubbler(int[] toSortArr) {
        int temp = 0;
        for (int i = 0; i < toSortArr.length; i++) {
            for (int j = 0; j < toSortArr.length; j++) {
                if (toSortArr[i] > toSortArr[j]) {
                    String logMeStringJ = Integer.toString(toSortArr[j]);
                    String logMeStringI = Integer.toString(toSortArr[i]);
                    logger(logMeStringJ, logMeStringI);

                    temp = toSortArr[i];
                    toSortArr[i] = toSortArr[j];
                    toSortArr[j] = temp;

                }
            }

        }
        return toSortArr;
    }

    public static void logger(String ItterString1, String ItterString2) {
        String file_name = "bubble_log.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);
                writer.write(ItterString1);
                writer.write(" swap ");
                writer.write(ItterString2);
                writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Something went wrong, check ur code");
        } 
    }
}