package HomeWork13;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Error in login");
    }

    public WrongLoginException(String error) {
        super(error);
    }
}
