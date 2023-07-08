package HomeWork17;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main4 {
    public static void main(String[] args) {
        String str = "310 BYN";
        Consumer<String> consumer = byn -> System.out.println(Double.parseDouble(byn.replaceAll("BYN", "")) / 3.1);
        consumer.accept(str);
    }
}
