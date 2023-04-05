import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet words = new HashSet();
        Scanner sc = new Scanner(new File("src/illiad.txt"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineToWords = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            for (String word:
                 lineToWords) {
                words.add(word);
            }
        }
        System.out.println(words.size());
    }
}
