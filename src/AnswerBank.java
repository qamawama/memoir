import java.util.ArrayList;
import java.util.List;

public class AnswerBank {

    private static List<List<String>> answerList = new ArrayList<>();
    private Answer answers = new Answer();
    private int sizeOfArray;

    public AnswerBank(int sizeOfArray){
        this.sizeOfArray = sizeOfArray;

    }
    public void setArray() {
        answers.getAnswers();
        int currSz = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            answerList.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                answerList.get(i).add(answers.separateByRegex().get(currSz));
                currSz++;
            }
        }
    }

    public void accessArrayElement(){
        try{
            for(int i = 0; i < answerList.size(); i++){
                for (int j = 0; j < 3; j++){
                    System.out.println(answerList.get(i).get(j));
                }
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public void displayAnswer(int i){
        for (int j = 0; j < 3; j++) {
            if (j == 0){
                System.out.print("A. ");
            } else if (j == 1) {
                System.out.print("B. ");
            } else if (j == 2){
                System.out.print("C. ");
            }
            System.out.println(answerList.get(i).get(j));
        }
    }

    public static List<List<String>> getAnswerList(){
        return answerList;
    }

    public static void main(String[] args) {
        AnswerBank test = new AnswerBank(3);
        test.setArray();
        test.displayAnswer(1);
    }
}