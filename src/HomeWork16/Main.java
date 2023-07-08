package HomeWork16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = {"a", "b", "a", "c"};
        Map<String, Boolean> map = new HashMap<>();
        for (String str : arrStr) {
            if (map.containsKey(str)) {
                map.replace(str, true);
            } else {
                map.put(str, false);
            }
        }
        System.out.println(map);
    }
}
