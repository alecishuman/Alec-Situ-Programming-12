import java.util.Objects;

public class Face extends Card {
    String face;
    Suits suit;

    public Face(String face, Suits suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public int getNumber() {
        if (face == "king") {
            return 13;
        } else if (face == "queen") {
            return 12;
        } else if (face == "jack") {
            return 11;
        } else {
            return 0;
        }
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
        Face face1 = (Face) o;
        return Objects.equals(face, face1.face) && suit == face1.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, suit);
    }
}
