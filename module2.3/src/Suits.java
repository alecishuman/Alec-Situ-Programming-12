public enum Suits {
    SPADES(4), HEARTS(3), CLUBS(2), DIAMONDS(1);

    int val;

    Suits(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
