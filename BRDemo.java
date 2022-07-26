import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BRDemo {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter some data");
        String s = br.readLine();
        System.out.println("S = "+s);

        System.out.println("Enter some data");
        int i = br.read();
        System.out.println("i = "+i);
    }
}
