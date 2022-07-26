import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BRDemo1 {
    public static void main(String[] args) throws IOException {
        /*FileWriter fw = new FileWriter("NIT.txt");
        fw.write(new char[] {'d' , 'a' , 'd'});
        fw.flush();*/

        FileReader fr = new FileReader("NIT.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();

        System.out.println("S : "+s);

    }
}
