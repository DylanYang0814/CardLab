import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> unDealt = new ArrayList<Card>();
    ArrayList<Card> Dealt = new ArrayList<Card>();

    public Deck(String[] ranks, String[] suits, int[] pointValue) {
        unDealt = new ArrayList<Card>();
        for (int a = 0; a < ranks.length; a++) {
            for (int b = 0; b < suits.length; b++) {
                for (int c = 0; c < pointValue.length; c++) {
                    Card newCard = new Card(ranks[c], suits[b], pointValue[c]);
                    unDealt.add(newCard);
                }
            }
        }
    }

    public boolean isEmpty() {
        if (unDealt.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return unDealt.size();
    }

    public Card deal() {
        if (unDealt.size() > 0) {
            Card dealt = unDealt.get(0);
            Dealt.add(unDealt.get(0));
            unDealt.remove(0);
            return dealt;
        } else {
            return null;
        }
    }

    public void shuffle() {
        for (int i = 0; i < Dealt.size(); i++) {
            int ran = (int) Math.random() * Dealt.size();
            unDealt.add(Dealt.get(ran));
            Dealt.remove(ran);
        }

        for (int k = unDealt.size(); k > 0; k--) {
            int r = (int) Math.random() * unDealt.size();
            Collections.swap(unDealt, r, k);
        }
    }
}