package BlackJack;

import BlackJackGamePackage.Card;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    List<Card> cardList = new ArrayList<>();
    int score;

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
}
