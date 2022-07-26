import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleDemo1 {
    public static void main(String[] args) throws IOException {
        //Console cn = new Console();
        Console cn = System.console();
        System.out.println("Enter the passwd");
        char c[] = cn.readPassword();

        FileWriter fw = new FileWriter("D:\\NIT\\NIT.txt");
        fw.write(c);
        fw.flush();
    }
}
