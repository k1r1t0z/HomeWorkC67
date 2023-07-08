package HomeWork17;

import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        String str = "310 BYN";
        Function<String, Double> function = byn -> Double.parseDouble(byn.replaceAll("BYN", "")) / 3.1;
        System.out.println(function.apply(str) + " USD");
    }
}
