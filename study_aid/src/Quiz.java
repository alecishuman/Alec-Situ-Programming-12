import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> quiz;

    public Quiz() {
        this.quiz = new ArrayList<Question>();
    }

    public ArrayList<Question> getQuiz() {
        return quiz;
    }

    public void addQuestion(Question question) {
        quiz.add(question);
    }
}
