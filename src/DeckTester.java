public class DeckTester {

    public static void main(String args[]) {
        String[] suitList = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] rankList = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck deck1 = new Deck(rankList, suitList, value);
        for (int i = 0; i < deck1.size(); i++) {
            System.out.println(deck1.deal());
        }
        deck1.shuffle();
        System.out.println(deck1.deal());
    }
}