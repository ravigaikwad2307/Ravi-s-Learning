import java.util.Scanner;

public class StaticDemo1 {
    static String cinemaName;
    static int costOfTicket;
    static Scanner sc = null;
    static{
        System.out.println("Enter the Cinema name");
        sc = new Scanner(System.in);
        cinemaName = sc.nextLine();
    }
    public static void main(String[] args){
        System.out.println("Main Method");
        System.out.println("Cinema Name : "+cinemaName);
        System.out.println("Cost of Ticket : "+costOfTicket);
    }
    static {
        System.out.println("Enter the Price");
        costOfTicket = sc.nextInt();
    }
}
