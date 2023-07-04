package HomeWork10;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kirill", 21);
        User user2 = new User("Kirill", 21);
        User user3 = new User("Kirill", 16);
        System.out.println(user.equals(user3));
    }
}
