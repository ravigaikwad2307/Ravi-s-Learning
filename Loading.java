import java.io.FileOutputStream;
import java.io.PrintStream;

public class Loading {
    static{
       System.out.println("Static Block");
    }
    public static void main(String[] args)throws Exception{
        System.out.println("Main Method");

        FileOutputStream fos = new FileOutputStream("yes.txt");
        PrintStream ps = new PrintStream(fos);
        ps.print("Yes I did it");
    }
}
