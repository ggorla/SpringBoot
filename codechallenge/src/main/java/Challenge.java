import java.util.Objects;

public class Challenge {
    private String question;
    private String answer;
    private boolean correct;

    public Challenge(String question, String answer, boolean correct) {
        this.question = question;
        this.answer = answer;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return correct == challenge.correct && Objects.equals(question, challenge.question) && Objects.equals(answer, challenge.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, correct);
    }
}
