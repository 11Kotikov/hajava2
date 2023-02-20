import java.util.Scanner;
// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
public class kaibun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type smth: ");
        String smth = input.nextLine().toLowerCase();
        String smthRev = reverseMyString(smth).toLowerCase();
        System.out.printf("palindrome : %s",palindrome(smth, smthRev));
        input.close();
    }

    public static String reverseMyString(String reverseMyStr) {
        if (reverseMyStr.length() <= 1) {
            return reverseMyStr;
        }
        String leftPart = reverseMyStr.substring(0, reverseMyStr.length() / 2);
        String rightPart = reverseMyStr.substring(reverseMyStr.length() / 2, reverseMyStr.length());
        return reverseMyString(rightPart) + reverseMyString(leftPart);
    }
    public static boolean palindrome(String toCheckString, String toCheckString1) {
        if (toCheckString.equals(toCheckString1)){
            return true;
        }
        return false;
    }
}