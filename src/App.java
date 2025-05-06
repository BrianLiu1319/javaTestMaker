
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        String[] arrQuestions = {
            "What can you find in Rustici Software's office?",
            "All of Rustici Software employees are expected to work no more than ____ hours per week.",
            "The end users of Rustici Software's products number in the _________",
            "Rustici Software is a (choose all that apply):",
            "Tim likes to wear:",
            "What are some of Brian's hobbies?",
            "Should we give Brian a chance?"
        };

        String[][] arrChoices = {
            {
                "Dart Board",
                "Ping Pong Table",
                "Cubicles",
                "Laptops with dual monitors",
                "TPS reports, ummm yeah",},
            {"80", "40", "50", "60"},
            {"Tens", "Hundreds", "Thousands", "Millions", "Billions"},
            {
                "Great place to work",
                "Respected leader in its field",
                "Place where people don't matter, just results",},
            {"Capri pants", "Goth attire", "Sport coat", "T-shirt and shorts"},
            {"Studying", "Playing Games", "Drawing", "Going out to cafes"},
            {"umm , yeah !"}
        };

        Integer[][] arrAnswers = {
            {1, 1, 0, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1},
            {1}};

        List<String> questions = new ArrayList<>(Arrays.asList(arrQuestions));
        List<List<String>> choices = new ArrayList<>();
        List<List<Integer>> answers = new ArrayList<>();

        for (Integer[] row : arrAnswers) {
            answers.add(new ArrayList<>(Arrays.asList(row)));
        }

        for (String[] row : arrChoices) {
            choices.add(new ArrayList<>(Arrays.asList(row)));
        }

        // we want to store each into a question class
        for (int i = 0; i < questions.size(); i++) {
            Question tempQuestion = new Question(questions.get(i), choices.get(i), answers.get(i));


            System.out.println(tempQuestion.getQuestion());
            System.out.println(tempQuestion.getOptions());
            System.out.println(tempQuestion.getAnswers());
        }

    }
}
