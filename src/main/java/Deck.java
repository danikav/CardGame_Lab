import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                PlayingCard card = new PlayingCard(suit, rank);
                this.cards.add(card);
            }
        }
        Collections.shuffle(this.cards);
    }
        public int count() {
        return this.cards.size();
    }

    public PlayingCard deal(){
       createDeck();
       PlayingCard cardDealt = this.cards.get(0);
        this.cards.remove(cardDealt);
//        System.out.println(cardDealt.getSuit());
        return cardDealt;
    }
}
