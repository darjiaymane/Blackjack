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


}
