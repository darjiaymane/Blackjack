package BlackJackGamePackage;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Person{
    public static int counter = 0;

    private int id_dealer;
    private List<Card> dealerCarteList = new ArrayList<>();


    public Dealer(String name) {
        super(name);
        this.id_dealer = counter++;
    }
    public int getId_dealer() {
        return id_dealer;
    }

    public List<Card> getDealerCarteList() {
        return dealerCarteList;
    }

    public void setDealerCarteList(Card card) {
        this.dealerCarteList.add(card);
    }
}
