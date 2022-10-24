package BlackJack;

public class Card {
    public static int counter =0;
    private int id;
    private int cardNumber;
    private  int cardSymbole;

    public Card(int cardNumber, int cardSymbole) {
        this.id = counter++;
        this.cardNumber = cardNumber;
        this.cardSymbole = cardSymbole;
    }

    public Card() {
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardSymbole() {
        return cardSymbole;
    }

    public void setCardSymbole(int cardSymbole) {
        this.cardSymbole = cardSymbole;
    }

    @Override
    public String   toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", cardSymbole=" + cardSymbole +
                '}';
    }
}
