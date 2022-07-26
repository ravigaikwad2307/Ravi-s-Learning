import java.io.*;

public class MultiFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("t1.txt");
        File f2 = new File("t2.txt");
        File f3 = new File("t3.txt");

        FileOutputStream fos1 = new FileOutputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f2);
        FileOutputStream fos3 = new FileOutputStream(f3);

       /* char [] c = {'H','i'};
        fos1.write(32);
        String str = "Ravi";
        fos2.write(32);*/
        byte b [] = {65,66,67};
        byte b1 [] = {100,97,100};
        byte b2 [] = {109,111,109};

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(b);
        bos.writeTo(fos1);
        bos.reset();
        bos.write(32);
        bos.write(b1);
        bos.writeTo(fos2);
        bos.reset();
        bos.write(32);
        bos.write(b2);
        bos.writeTo(fos3);


    }
}
