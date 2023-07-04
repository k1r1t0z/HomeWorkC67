package HomeWork13;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Error in password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
