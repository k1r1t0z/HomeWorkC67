package HomeWork6;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(5555, 250);
        CreditCard creditCard1 = new CreditCard(5545, 250);
        CreditCard creditCard2 = new CreditCard(5565, 250);
        creditCard.minusBalance(34);
        creditCard.allInfo();
    }
}
