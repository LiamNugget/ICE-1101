public class Pack {

    // Initialize the array of cards
    private PlayingCard[] cards = new PlayingCard[52];

    // Enum for the suits of the cards
    enum Suit {
        Clubs,
        Diamonds,
        Hearts,
        Spades
    }

    // Constructor that initializes the pack of cards
    public Pack() {
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (int rank = 2; rank <= 14; rank++) {
                cards[index] = new PlayingCard(rank, suit.toString());
                index++;
            }
        }
    }

    // Shuffles the pack of cards.
    void shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            PlayingCard comparison = cards[i];
            cards[i] = cards[j];
            cards[j] = comparison;
        }
    }

    // Returns a string representation of the pack of cards.
    public String toString() {
        String result = "";
        for (int i = 0; i < cards.length; i++) {
            result += cards[i] + "\n";
        }
        return result;
    }

    // Main method to test the Pack class.
    public static void main(String[] args) {
        Pack pack = new Pack();
        pack.shuffle();
        System.out.println(pack);
    }
}
