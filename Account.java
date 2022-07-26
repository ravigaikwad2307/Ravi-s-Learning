import java.util.Scanner;

public class Account{
    long accNo;
    String accHoldName;
    static Scanner sc = new Scanner(System.in);
    Account(long no, String name){
        accNo = no;
        accHoldName = name;
    }

    public static void main(String[] args){
        System.out.println("Enter the Number of customer");
        Short record = sc.nextShort();
        Account[] acc = new Account[record];

        for(int i = 0; i<acc.length; i++){
            System.out.println("Enter the "+(i+1)+" customer Account number");
            long no = sc.nextLong();
            System.out.println("Enter the "+(i+1)+"customer Name");
            String name = sc.next();
            Account obj = new Account(no,name);
            acc[i] = obj;
        }
        for(int i=0; i< acc.length; i++){
            Account obj = acc[i];
            System.out.println("Customer "+(i+1)+" Details");
            System.out.println("Account Number "+obj.accNo);
            System.out.println("Account Holder Name "+obj.accHoldName);
        }
    }
}
