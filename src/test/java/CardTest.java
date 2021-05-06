import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    PlayingCard card;

    @Before
    public void before(){
        card = new PlayingCard(Suit.HEARTS, Rank.KING);
//        card2 = new PlayingCard(Suit.DIAMONDS, Rank.SEVEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetCardRank(){
//        Card should have a rank property of either 2-10 or J, Q, K, A
        assertEquals(Rank.KING, card.getRank());
    }
    @Test
    public void canGetRankValue(){
        assertEquals(10, card.getRankValue());
    }


//    @Test
//    public void canBeMispelled(){
//        PlayingCard mispelledCard = new PlayingCard("Heaaaarrrrttts");
//        assertEquals("Heaaaarrrrttts", mispelledCard.getSuit());
//    }
//
//    @Test
//    public void canHaveAWrongSuit(){
//        PlayingCard wrongSuit = new PlayingCard("Banana");
//        assertEquals("Banana", wrongSuit.getSuit());
//    }
}
