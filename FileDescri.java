import java.io.*;
import java.util.Scanner;

public class FileDescri {
    public static void main(String[] args) throws IOException {
        /*File f = new File("t4.txt");
        FileOutputStream fos = new FileOutputStream(f);
        FileDescriptor fd = fos.getFD();
        FileOutputStream fos1 = new FileOutputStream(fd);
        fos1.write("Hello Ravi ....".getBytes());*/


        File f1 = new File("t4.txt");
        FileInputStream fis =new FileInputStream(f1);
        FileDescriptor fd1 = fis.getFD();
        FileInputStream fis1 = new FileInputStream(fd1);

        Scanner sc = new Scanner(fis1);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }


    }
}
