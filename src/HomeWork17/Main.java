package HomeWork17;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateBirth = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(dateBirth).plusYears(100);
        System.out.println(localDate);
    }
}
