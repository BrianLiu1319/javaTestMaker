import java.util.List;

public class Question {


    private String question;
    private List<String> options;
    private List<Integer> correctAnswer;

    Question (String question, List<String> options, List<Integer> correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    String getQuestion() {
        return this.question;
    }

    List<String> getOptions() {
        return this.options;
    }

    List<Integer> getAnswers() {
        return this.correctAnswer;
    }

    void changeQuestion(String question) {
        this.question = question;
    }

    void changeOption(List<String> options) {
        this.options = options;
    }

    void changeAnswer(List<Integer> answer) {
        this.correctAnswer = answer;
    }


}
