import java.io.*;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        File f = new File("Test.txt");
        //FileOutputStream fos = new FileOutputStream("Test.txt");
        //FileOutputStream fos = new FileOutputStream("Test.txt",true);
        //FileOutputStream fos = new FileOutputStream("Test.txt",false);
        //FileOutputStream fos = new FileOutputStream(f,true);
        FileOutputStream fos = new FileOutputStream(f,false);
        fos.write(new byte[] {100,97,100});
        fos.write(32);
        fos.write(new byte[] {65,66,67,68,69,70},2,4);
        fos.write(32);

    }
}
