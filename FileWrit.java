import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrit {
    public static void main(String[] args) throws IOException {
        //File f = new File("Test1.txt");
        //FileWriter fw = new FileWriter(f);
        //FileWriter fw = new FileWriter(f,true);
        //FileWriter fw = new FileWriter(f,false);
        //FileWriter fw = new FileWriter("Test3.txt");
       // FileWriter fw = new FileWriter("Test3.txt",true);
        FileWriter fw = new FileWriter("Test3.txt",false);
        fw.write(32);
        char[] c = {'N','I','T'};
        fw.write(c);
        fw.write(32);
        fw.write("Karthik IT");
        fw.write(32);
        char[] c1 = {'a','b','c','d','e','f'};
        fw.write(c1,1,4);
        //fw.write(c1);

        fw.flush();
    }
}
