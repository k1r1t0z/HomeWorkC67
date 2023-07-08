package HomeWork16;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String[] arrStr = {"man", "color", "red", "god"};
        Map<String, String> map = new HashMap<>();
        for (String str : arrStr) {
            map.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
        }
        System.out.println(map);
    }
}
