import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws IOException {
       // File f = new File("Excep.java");
        FileInputStream fis = new FileInputStream("Excep.java");
       /* int i = 1;
        while(i = fis.read()!= -1){
            System.out.println((char)i);
        }*/
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }

    }
}
