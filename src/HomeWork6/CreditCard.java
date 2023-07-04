package HomeWork6;

public class CreditCard {
    private int numbCard;
    private int sumOfCard;

    public CreditCard(int numbCard, int sumOfCard) {
        this.numbCard = numbCard;
        this.sumOfCard = sumOfCard;
    }

    public int getNumbCard() {
        return numbCard;
    }

    public void setNumbCard(int numbCard) {
        this.numbCard = numbCard;
    }

    public int getSumOfCard() {
        return sumOfCard;
    }

    public void setSumOfCard(int sumOfCard) {
        this.sumOfCard = sumOfCard;
    }

    void plusBalance (int sum) {
        sumOfCard = sumOfCard + sum;
    }

    void minusBalance (int sum) {
        if (sumOfCard >= sum) {
            sumOfCard -= sum;
        } else {
            System.out.println("Недопустимая сумма");
        }
    }

    void allInfo () {
        System.out.println(numbCard);
        System.out.println(sumOfCard);
    }
}
