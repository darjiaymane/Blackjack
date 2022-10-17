package BlackJackGamePackage;

import java.util.ArrayList;
import java.util.List;

public class Player extends Person{
    public static int counter = 0;
    private int id_player;
    private List<Card> dealerCarteList;

    public Player(String name) {
        super(name);
        this.id_player = counter++;
    }
}
