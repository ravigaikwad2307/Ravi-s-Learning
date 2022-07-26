import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args){
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println("f = "+f);

        System.out.println("Enter the data");
        double d = sc.nextDouble();
        System.out.println("d = "+d);
    }
}
