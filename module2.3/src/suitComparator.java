import java.util.Comparator;

public class suitComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getSuit().getVal() > o2.getSuit().getVal()) {
            return -1;
        } else if (o1.getSuit().getVal() < o2.getSuit().getVal()) {
            return 1;
        } else {
            return 0;
        }
    }
}