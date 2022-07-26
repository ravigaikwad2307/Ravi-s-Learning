import java.io.DataInputStream;
import java.io.IOException;

public class DISDemo {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the data");
        String s = dis.readLine();
        System.out.println("s = "+s);

        System.out.println("Enter the Integer data");
        int i = Integer.parseInt(dis.readLine());
        System.out.println("Integer = "+i);

    }
}
