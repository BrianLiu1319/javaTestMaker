import java.util.ArrayList; 
import java.util.List;

public class Question {


    String question;
    List<String> options;
    String correctAnswer;

    Question() {
        this.question = "";
        this.options = new ArrayList<>();
        this.correctAnswer = "";

    }

    Question (String question, ArrayList<String> options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

}
