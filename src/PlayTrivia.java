import java.util.Scanner;
public class PlayTrivia {

    // Trivia game attributes
    private QuestionBank questionBank = new QuestionBank();
    private Answer answer = new Answer();
    Scanner scanner = new Scanner(System.in);


    // Method: play game
    protected void play(){
        questionBank.getQuestions();
        answer.getAnswer();
        Answer.getCorrAnswer();      //correct answer is static

        int qSize = questionBank.getQuestions().size();

        for (int i = 0; i < qSize; i++){
            questionBank.displayQuestions(i);
            answer.displayAnswer(i);
            String input = scanner.next();
            answer.checkAns(input,i);
        }
    }
}
