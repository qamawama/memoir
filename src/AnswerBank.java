import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnswerBank {

    List<List<String>> answerList = new ArrayList<List<String>>();

    Answer answers = new Answer();
    String holder = "test";
    String holder2 = "test2";
    int sizeOfArray;
    public AnswerBank(int sizeOfArray){
        this.sizeOfArray = sizeOfArray;

    }
    protected void setArray() {
        for (int i = 0; i < sizeOfArray; i++) {
            answerList.add(new ArrayList<String>());
            for (int j = 0; j < 4; j++) {
                answerList.get(i).add(holder);
            }
        }
    }

    protected void accessArrayElement(){
        try{
            System.out.println(answerList.get(0).get(0));
            System.out.println(answerList.get(1).get(0));
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }


}

