package HomeWork17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<String> supplier = () -> {
          String str = scanner.nextLine();
          return String.valueOf(new StringBuilder(str).reverse());
        };
        System.out.println(supplier.get());
    }
}
