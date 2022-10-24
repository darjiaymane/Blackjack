package BlackJack;

import BlackJackGamePackage.Card;

import java.util.List;

public class Player extends Person{
    int coins;
    int bet;

    public Player(String name, List<Card> cardList, int score, int coins, int bet) {
        super(name, cardList, score);
        this.coins = coins;
        this.bet = bet;
    }

    public Player() {
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    @Override
    public String toString() {
        return "Player{" +
                "\nname='" + name +
                "\ncardList=" + cardList +
                "\nscore=" + score+
                "\ncoins=" + coins +
                "\nbet=" + bet
                ;
    }
}
