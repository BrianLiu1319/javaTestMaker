
import java.util.ArrayList;
import java.util.List;


public class Test {
    List<Question> questionBank;


    Test() {
        this.questionBank = new ArrayList<>();
    }

    Test(List<Question> questionArr) {

        this.questionBank = new ArrayList<>();

        for (Question q : questionArr){
            this.questionBank.add(q);
        }
    }
}
