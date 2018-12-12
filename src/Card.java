public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getPointValue() {
        return pointValue;
    }

    public boolean equals(Card otherCard) {
        return (otherCard.getPointValue() == this.getPointValue());
    }

    public String toString() {
        return "Rank: " + this.rank + "\nSuit: " + this.suit + "\nValue: " + this.pointValue + "\n";
    }
}
