import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\NIT\\NIT.txt");
        Scanner sc = new Scanner(fis);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
