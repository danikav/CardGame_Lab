public class PlayingCard {
    public int getRankValue;
    private Suit suit;
    private Rank rank;

    public PlayingCard(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank(){
        return rank;
    }
    public int getRankValue(){
        return this.rank.getValue();
    }
}
