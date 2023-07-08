package HomeWork17;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        int[] arrInt = {1, -2, -4, 3, 4, 12, -45};
        Predicate<Integer> predicate = num -> num > 0;
        for (int result : arrInt) {
            if (predicate.test(result)) {
                System.out.println(result);
            }
        }
    }
}
