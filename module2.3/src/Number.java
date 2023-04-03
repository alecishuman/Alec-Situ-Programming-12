import java.util.Objects;

public class Number extends Card{
    int number;
    Suits suit;

    public Number(int number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Face{" +
                "face='" + number + '\'' +
                ", suit=" + suit +
                '}';
    }

    @Override
    public boolean equals(Card o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number face1 = (Number) o;
        return Objects.equals(number, face1.number) && suit == face1.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, suit);
    }
}
