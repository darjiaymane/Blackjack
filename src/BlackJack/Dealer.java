package BlackJack;

import BlackJackGamePackage.Card;

import java.util.List;

public class Dealer extends Person{
    public Dealer(String name, List<Card> cardList, int score) {
        super(name, cardList, score);
    }

    public Dealer() {
    }

    public static void shuffleCards(){

    }
}
