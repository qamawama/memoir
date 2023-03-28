import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<String> elements = new ArrayList<>();
    private ReadFile questionFile;
    private List<List<String>> data;

    void getQuestions(){
//        questionFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\question.txt");
//        this.questions = questionFile.getData();
        questionFile = new ReadFile();
        data = questionFile.getData();

        for (int i = 1; i < data.size(); i++ ){
            elements.add(data.get(i).get(0));
        }
        questions.addAll(elements);
    }
    public ArrayList<String> getArray(){
        return questions;
    }

    public void displayQuestions(int index){
        System.out.println();
        System.out.println("QUESTION " + (index+1));
        System.out.println(this.questions.get(index));
    }


//    public static void main(String[] args) {
//        QuestionBank qb = new QuestionBank();
//        qb.getQuestions();
//        for(int i = 0; i < qb.getArray().size(); i++){
//            System.out.println(qb.getArray().get(i));
//        }
//    }
}