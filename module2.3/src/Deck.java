import java.util.LinkedList;

public class Deck {
    LinkedList deck = new LinkedList();

    public void createDeck() {
        int number = 1;
        while (number <= 10) {
            int suit = 1;
            while (suit <= 4) {
                if (suit == 1) {
                    deck.add(new Number(number, Suits.SPADES));
                }
                if (suit == 2) {
                    deck.add(new Number(number, Suits.HEARTS));
                }
                if (suit == 3) {
                    deck.add(new Number(number, Suits.CLUBS));
                }
                if (suit == 4) {
                    deck.add(new Number(number, Suits.DIAMONDS));
                }
                suit++;
            }
            number++;
        }
        String face = "jack";
        while (number <= 13) {
            if (number == 12) {
                face = "queen";
            } else if (number == 13) {
                face = "king";
            }
            int suit = 0;
            while (suit <= 4) {
                if (suit == 1) {
                    deck.add(new Face(face, Suits.SPADES));
                }
                if (suit == 2) {
                    deck.add(new Face(face, Suits.HEARTS));
                }
                if (suit == 3) {
                    deck.add(new Face(face, Suits.CLUBS));
                }
                if (suit == 4) {
                    deck.add(new Face(face, Suits.DIAMONDS));
                }
                suit++;
            }
        }
    }

    public LinkedList drawHand() {
        LinkedList hand = new LinkedList();
        int i = 0;
        while (i < 7) {
            int x = (int) Math.floor(Math.random() * (52 - i));
            hand.add(deck.get(x));
            deck.remove(x);
            i++;
        }
        return hand;
    }



}
