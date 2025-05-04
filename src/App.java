
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
        List<String> questions = new ArrayList<>(Arrays.asList(arrQuestions));

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

        List<List<String>> choices = new ArrayList<>();

        for (String[] row : arrChoices) {
            choices.add(new ArrayList<>(Arrays.asList(row)));
        }

        List<List<Integer>> answers = new ArrayList<>();

        Integer[][] arrAnswers = {
            {1, 1, 0, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1}};

        for (Integer[] row : arrAnswers) {
            answers.add(new ArrayList<>(Arrays.asList(row)));
        }


        

    }
}
