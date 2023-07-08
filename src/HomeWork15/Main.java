package HomeWork15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(str.split(" ")));
        System.out.println(treeSet);
    }
}
