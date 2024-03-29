import java.util.Objects;

public class Number extends Card{
    int face;
    Suits suit;

    public Number(int number, Suits suit) {
        this.face = number;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
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
                "face='" + face + '\'' +
                ", suit=" + suit +
                '}';
    }

    @Override
    public boolean equals(Card o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number face1 = (Number) o;
        return Objects.equals(face, face1.face) && suit == face1.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, suit);
    }
}
