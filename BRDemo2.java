import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BRDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("NIT.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        System.out.println("S : "+s);

        int count = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            //System.out.println(st.nextToken());
            count = count + Integer.parseInt(st.nextToken());

        }
        System.out.println("Count = " +count);

    }
}
