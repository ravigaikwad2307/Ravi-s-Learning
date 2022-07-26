import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args)throws FileNotFoundException {
        File f = new File("Excep.java");
        FileReader fr = new FileReader(f);
        Scanner sc = new Scanner(fr);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        System.out.println("Program ends successfully");
    }
}
