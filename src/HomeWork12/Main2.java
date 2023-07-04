package HomeWork12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern patternEmail = Pattern.compile("\\S+@\\S+\\.\\S+");
        Matcher matcherEmail = patternEmail.matcher(text);
        Pattern patternPhoneNum = Pattern.compile("[+]?[(]?[0-9]{2}[)]?[0-9]{7}");
        Matcher matcherPhoneNum = patternPhoneNum.matcher(text);
        Pattern patternDoc = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher matcherDoc = patternDoc.matcher(text);
        while (matcherEmail.find()) {
            System.out.println("E-mail: " + matcherEmail.group());
        }
        while (matcherPhoneNum.find()) {
            System.out.println("Phone number: " + matcherPhoneNum.group());
        }
        while (matcherDoc.find()) {
            System.out.println("Document number: " + matcherDoc.group());
        }
    }
}
