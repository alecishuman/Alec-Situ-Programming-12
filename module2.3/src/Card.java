import java.util.Objects;

public abstract class Card {
    public abstract String toString();

    public abstract boolean equals(Card card);

    public abstract int hashCode();

}
