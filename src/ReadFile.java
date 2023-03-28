import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {
    //private String fileName;
    //private ArrayList<String> data = new ArrayList<>();
    //private ArrayList<String> data;
    List<List<String>> data = new ArrayList<>();

    //public ReadFile(String fileName){
    //    this.fileName = fileName;
    //}

    public ReadFile(){

    }

//    public ArrayList<String> getData() {
//        try {
//            File myObj = new File(fileName);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String line = myReader.nextLine();
//                data.add(line);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return data;
//    }

    public List<List<String>> getData(){
        String path = "C:/Users/User/OneDrive - Universiti Teknologi PETRONAS/1st 2nd/Object Oriented Programming/memoir/QnA test.csv";
        String line = "";
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                //data = new ArrayList<>(Arrays.asList(line.split(",")));
                data.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}