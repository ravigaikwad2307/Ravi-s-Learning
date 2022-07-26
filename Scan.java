import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some data");
        String s = sc.nextLine();
        System.out.println("s : "+s);

        System.out.println("Enter some number");
        int i = sc.nextInt();
        System.out.println("i : "+i);

        System.out.println("Enter the number");
        int j = sc.nextInt();
        System.out.println("j : "+j);

        System.out.println("i+j = "+(i+j));
    }
}
