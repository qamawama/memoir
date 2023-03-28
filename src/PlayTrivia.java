import java.util.Scanner;
public class PlayTrivia {

    // Trivia game attributes
    private QuestionBank questionBank = new QuestionBank();
    private Answer answer = new Answer();
    private AnswerBank allAnswers;
    private Scanner scanner = new Scanner(System.in);
    private boolean result;
    private double score;


    // Method: play game
    public void play(){
        questionBank.getQuestions();
        allAnswers = new AnswerBank(questionBank.getArray().size());
        allAnswers.setArray();

        //Answer.getCorrAnswer();      //correct answer is static

        int qSize = questionBank.getArray().size();

        for (int i = 0; i < qSize; i++){
            questionBank.displayQuestions(i);
            allAnswers.displayAnswer(i);
            String input = scanner.nextLine();
            result = answer.checkAns(input,i);
            if (result == true){
                score = 1;
            } else if (result == false) {
                score = 0;
            }
            answer.calcTotalScore(score);
            System.out.println(result);
        }

        answer.displayTotalScore();
    }
}