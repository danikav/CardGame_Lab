import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canCreateDeck(){
        deck.createDeck();
        assertEquals(52, deck.count());
    }

    @Test
    public void canDealCard(){
        deck.deal();
        assertEquals(51, deck.count());
    }
}
