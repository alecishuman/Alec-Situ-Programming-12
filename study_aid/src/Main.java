import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz quiz = new Quiz();
        while (true) {
            System.out.println("Add question (a), do quiz (d), or quit (q)?");
            String str = sc.nextLine();
            if (str.equals("a")) {
                System.out.println("What is your question?");
                String question = sc.nextLine();
                System.out.println("What is the correct answer to the question?");
                String answer = sc.nextLine();
                System.out.println("What is the first choice?");
                String a = sc.nextLine();
                System.out.println("What is the second choice?");
                String b = sc.nextLine();
                System.out.println("What is the third choice?");
                String c = sc.nextLine();
                System.out.println("What is the fourth choice?");
                String d = sc.nextLine();
                quiz.addQuestion(new Question(question, a, b, c, d, answer));
            } else if (str.equals("d")) {
                int count = 0;
                for (Question question:
                     quiz.getQuiz()) {
                    System.out.println(question.getQuestion() + " (type the answer out)");
                    System.out.println("(a) " + question.getChoice1() + " (b) " + question.getChoice2());
                    System.out.println("(c) " + question.getChoice3() + " (d) " + question.getChoice4());
                    String answer = sc.nextLine();
                    if (question.checkResponse(answer)) {
                        count++;
                    }
                    System.out.println(question.checkResponse(answer));
                }
                System.out.println("Your final score: " + count + "/" + quiz.getQuiz().size());
            } else if (str.equals("q")) {
                System.out.println("You have finished.");
                break;
            } else {
                System.out.println("That is not an option. Please try again.");
            }
        }
    }
}
