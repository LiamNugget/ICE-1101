public class PlayingCardPackTester {

    public static void main(String[] args) {
        PlayingCard card1 = new PlayingCard(5, "Hearts");
        PlayingCard card2 = new PlayingCard(5, "Hearts");
        PlayingCard card3 = new PlayingCard(7, "Spades");

        Pack pack = new Pack();

        // Testing equals method
        System.out.println("=== Testing equals method ===");
        // Test if equals method returns true for two cards with the same rank and suit
        if (card1.equals(card2)) {
            System.out.println("Test 1: passed");
        } else {
            System.out.println("Test 1: failed");
        }

        // Test if equals method returns false for two cards with different rank and
        // suit
        if (!card1.equals(card3)) {
            System.out.println("Test 2: passed");
        } else {
            System.out.println("Test 2: failed");
        }

        // Test if equals method returns false for a non-PlayingCard object
        if (!card1.equals("test")) {
            System.out.println("Test 3: passed");
        } else {
            System.out.println("Test 3: failed");
        }

        // Test if equals method returns true for the same object
        if (card1.equals(card1)) {
            System.out.println("Test 4 passed");
        } else {
            System.out.println("Test 4 failed");
        }

        // Test card creation
        PlayingCard card4 = new PlayingCard(1, "Spades");
        PlayingCard card5 = new PlayingCard(6, "Hearts");

        // Test rank and suit getters
        System.out.println();
        System.out.println("=== Test rank and suit getters ===");
        System.out.println("Card 1 rank: " + card4.getRank()); // 1
        System.out.println("Card 1 suit: " + card4.getSuit()); // Spades
        System.out.println("Card 2 rank: " + card5.getRank()); // 6
        System.out.println("Card 2 suit: " + card5.getSuit()); // Hearts

        // Test string representation
        System.out.println();
        System.out.println("=== Test string representation ===");
        System.out.println("Card 1: " + card4); // Ace of Spades
        System.out.println("Card 2: " + card5); // 6 of Hearts

        // Print the formatted string representation of both cards
        System.out.println();
        System.out.println("=== Format method string ===");
        System.out.println(card4.format() + ", " + card5.format());

        // Print if cards are equal
        System.out.println();
        System.out.println("=== Equals method (comparing card 1 to 3) ===");
        System.out.println(card1.equals(card3));

        // Test Pack Generation & Printing
        System.out.println();
        System.out.println("=== Test Pack Generation & Printing ===");

        // Test the toString method
        System.out.println("=== Initial pack ===");
        System.out.println(pack);

        // Test the shuffle method
        pack.shuffle();
        System.out.println("=== Shuffled pack ===");
        System.out.println(pack);

        // Test the toString method again
        System.out.println("=== Un-shuffled pack ===");
        System.out.println(pack);
    }
}
