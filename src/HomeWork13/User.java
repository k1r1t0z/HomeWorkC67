package HomeWork13;

public class User {
    static boolean info(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[A-z]{1,20}")) {
            throw new WrongLoginException("Login incorrect");
        }

        if (!password.matches("^[A-Z-a-z-0-9]{1,20}")) {
            System.out.println(password);
            throw new WrongPasswordException("Password error");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password don't match");
        }
        return true;
    }
}
