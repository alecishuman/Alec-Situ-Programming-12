public class Main {
    public static void main(String[] args) {
        Caesar four = new Caesar(4);
        String text = "abcdef";
        System.out.println(four.encrypt(text));
        System.out.println(four.decrypt(four.encrypt(text)));
    }


}
