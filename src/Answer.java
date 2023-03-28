import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Answer implements Score {
    private ArrayList<String> unfilteredAnswer = new ArrayList<>();
    private ReadFile answerFile;
    private String commaSeparated;
    private ArrayList<String> elements;
    private ArrayList<String> filteredAnswer = new ArrayList<>();
    private static ArrayList<String> correctAns = new ArrayList<>();
    private List<List<String>> data;
    private double sumScore = 0;
    AnswerBank answerBank;

    public void getAnswers() {
        answerFile = new ReadFile();
        this.data = answerFile.getData();
        // All answers (with regex)
        for (int i = 1; i < data.size(); i++ ){
            this.unfilteredAnswer.add(data.get(i).get(1));
        }
        // Correct answer
        for(int i = 1; i < data.size(); i++){
            correctAns.add(data.get(i).get(2));
        }
        /*for(int i = 0; i < unfilteredAnswer.size(); i++){
            System.out.println(unfilteredAnswer.get(i));
        }*/
    }


    public ArrayList<String> separateByRegex() {

        for (int i = 0; i < unfilteredAnswer.size(); i++) {
            commaSeparated = unfilteredAnswer.get(i);
            //elements = Stream.of(commaSeparated.split(",")).map(String::trim).toList();
            String [] elements = commaSeparated.split(" - ");
            this.filteredAnswer.addAll(Arrays.asList(elements));
        }
        return filteredAnswer;
    }


//    public static void getCorrAnswer(){
//        ReadFile corrFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\correctAnswer.txt");
//        correctAns = corrFile.getData();
//    }


    public boolean checkAns(String input,int qNum){

        List<List<String>> answerList = answerBank.getAnswerList();

        int aNum = 0;
        if(input.equals("A")){
             aNum = 0;
        } else if (input.equals("B")) {
            aNum = 1;
        }else if (input.equals("C")) {
            aNum = 2;
        }

        if ((answerList.get(qNum).get(aNum)).equals(correctAns.get(qNum))){
            return true;
        } else {
            return false;
        }
    }

    public void calcTotalScore(double score){
        this.sumScore += score;
    }

    public void displayTotalScore(){
        System.out.println("Total score: " + this.sumScore);
    }


    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.getAnswers();
        ans.separateByRegex();

        ArrayList<String> test = new ArrayList<>();
        test = ans.separateByRegex();

        /*for (int i = 0; i < ans.filteredAnswer.size(); i++){
            System.out.println(ans.filteredAnswer.get(i));
        }*/


    }
}