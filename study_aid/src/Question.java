public class Question {
    public String question;
    public String choice1;
    public String choice2;
    public String choice3;
    public String choice4;
    public String answer;

    public String getQuestion() {
        return question;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public String getAnswer() {
        return answer;
    }

    public Question(String question, String choice1, String choice2, String choice3, String choice4, String answer) {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.answer = answer;
    }

    public Boolean checkResponse(String response) {
        if (response.equals(this.answer)) {
            return true;
        } else {
            return false;
        }
    }

}
