package BlackJackGamePackage;

public class Card {
    private int counter = 0;
    private int id;
    private int cardNumber;
    private int cardSymbole;

    public Card(int cardNumber, int cardSymbole) {
        this.id = counter++;
        this.cardNumber = cardNumber;
        this.cardSymbole = cardSymbole;
    }


}
