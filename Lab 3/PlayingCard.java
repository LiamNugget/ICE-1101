public class PlayingCard {
    private int rank; // The rank of the card. 1-13
    private String suit; // The suit of the card. Diamonds, Hearts, Spades, Clubs

    // Constructor that initializes the card with rank, suit.
    public PlayingCard(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter method to retrieve the rank of the card.
    public int getRank() {
        return rank;
    }

    // Getter method to retrieve the suit of the card.
    public String getSuit() {
        return suit;
    }

    // Compares the rank and suit of the object to another PlayingCard object and
    // returns a boolean value indicating if they are the same.
    public boolean equals(Object card) {
        // Check if the object being compared is the same object as this card
        if (card == this) {
            return true;
        }

        // Check if the object being compared is a PlayingCard
        if (!(card instanceof PlayingCard)) {
            return false;
        }

        // Cast the object to a PlayingCard and compare the rank and suit
        PlayingCard other = (PlayingCard) card;
        return this.rank == other.rank && this.suit.equals(other.suit);
    }

    // Returns a string representation of the card, including rank and suit.
    public String toString() {
        String trueRank;
        // Assign the rank of the card to a string variable depending on the rank number
        switch (rank) {
            case 11:
                trueRank = "Jack";
                break;
            case 12:
                trueRank = "Queen";
                break;
            case 13:
                trueRank = "King";
                break;
            case 14:
                trueRank = "Ace";
                break;
            default:
                trueRank = Integer.toString(rank);
                break;
        }
        return getClass().getName() + "[Rank=" + trueRank + "; Suit=" + suit + "]";
    }

    // format method that returns a formatted string of the object's information
    public String format() {
        String trueRank;
        // Assign the rank of the card to a string variable depending on the rank number
        switch (rank) {
            case 11:
                trueRank = "Jack";
                break;
            case 12:
                trueRank = "Queen";
                break;
            case 13:
                trueRank = "King";
                break;
            case 14:
                trueRank = "Ace";
                break;
            default:
                trueRank = Integer.toString(rank);
                break;
        }
        return String.format(trueRank + " of " + suit);
    }
}