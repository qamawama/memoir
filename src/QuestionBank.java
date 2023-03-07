import java.util.ArrayList;

public class QuestionBank {

    // Questionbank attributes
    ArrayList<String> questions;
    ReadFile questionFile;

    // Method: get questions in question bank
    protected ArrayList<String> getQuestions(){
        questionFile = new ReadFile("C:/Users/User/OneDrive - Universiti Teknologi PETRONAS/1st 2nd/Object Oriented Programming/memoir/src/question.txt");
        this.questions = questionFile.getData();
        return this.questions;
    }

    // Method: display questions
    protected void displayQuestions(int index){
        System.out.println();
        System.out.println("QUESTION " + (index+1));
        System.out.println(this.questions.get(index));
    }


}
