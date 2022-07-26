import java.io.*;

public class DISDemo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("Kite.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeBoolean(true);
        dos.writeInt(23);
        dos.writeChar('R');
        dos.writeChars("NIT");

        FileInputStream fis = new FileInputStream("Kite.txt");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readLine());

    }
}
