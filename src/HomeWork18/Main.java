package HomeWork18;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        arrayList.stream().distinct().collect(Collectors.toList()).
                stream().filter(sum -> sum % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}
