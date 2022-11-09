import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //use a scanner to read from a file is easier than using file reader for the assignment
        //put in ArrayList collection
        try {
        File f = new File("C:\\Users\\W0718860\\IdeaProjects\\untitled1\\src\\file.txt");
        Scanner input = new Scanner(f);

        while(input.hasNext()){
        String line = input.nextLine();
            System.out.println(line);}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
