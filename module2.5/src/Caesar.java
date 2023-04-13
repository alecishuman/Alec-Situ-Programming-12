import java.util.HashMap;

public class Caesar {
    int shift;
    HashMap<Character, Character> cipher = new HashMap<>();
    HashMap<Character, Character> decypher = new HashMap<>();

    public Caesar(int shift) {
        this.shift = shift;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0, n = alphabet.length() ; i < n ; i++) {
            char c = alphabet.charAt(i);
            cipher.put(c, alphabet.charAt(Math.floorMod(i + shift, 26)));
            decypher.put(c, alphabet.charAt(Math.floorMod(i - shift, 26)));
        }
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String encrypt(String text) {
        String code = "";
        for (char c:
             text.toCharArray()) {
            code += cipher.get(c);
        }
        return code;
    }

    public String decrypt(String cipher) {
        String text = "";
        for (char c:
             cipher.toCharArray()) {
            text += decypher.get(c);
        }
        return text;
    }
}
