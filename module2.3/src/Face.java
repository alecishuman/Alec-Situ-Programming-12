import java.util.Objects;

public class Face extends Card {
    String face;
    Suits suit;

    public Face(String face, Suits suit) {
        this.face = face;
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
        Face face1 = (Face) o;
        return Objects.equals(face, face1.face) && suit == face1.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, suit);
    }
}
