import java.util.ArrayList;

public class Answer {

    //Answer attributes
    private ArrayList<String> answer = new ArrayList<String>();
    private static ArrayList<String> correctAns = new ArrayList<String>();
    private ReadFile answerFile;


    // Method: get answer from answer.txt
    protected void getAnswer(){
        answerFile = new ReadFile("C:/Users/User/OneDrive - Universiti Teknologi PETRONAS/1st 2nd/Object Oriented Programming/memoir/src/answer.txt");
        this.answer = answerFile.getData();
    }

    // Method: get correct answer from correctAnswer.txt
    protected static void getCorrAnswer(){
        ReadFile readFile = new ReadFile("C:/Users/User/OneDrive - Universiti Teknologi PETRONAS/1st 2nd/Object Oriented Programming/memoir/src/correctAnswer.txt");
        correctAns = readFile.getData();
    }

    // Method: display answer choices
    protected void displayAnswer(int i){
        System.out.println(answer.get(i));
    }

    // Method: check if the answer is correct
    protected void checkAns(String input,int qNum){
        if(input.equals(correctAns.get(qNum))){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
