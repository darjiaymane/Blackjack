package BlackJack;

import BlackJackGamePackage.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    protected String name;
    protected List<Card> cardList = new ArrayList<>();
    protected int score;

    public Person(String name, List<Card> cardList, int score) {
        this.name = name;
        this.cardList = cardList;
        this.score = score;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person:" +
                "\n  name:'" + name + '\'' +
                "\n  cardList:" + cardList +
                "\n  score:" + score ;
    }
}
