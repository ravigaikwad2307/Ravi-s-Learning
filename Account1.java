import java.util.Scanner;

public class Account1 {
    String accountHolderName;
    double balance;

    Account1(){
        balance = 0.0;
    }
    Account1(double balance){
        this.balance = balance;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account Type");
        String accType = sc.nextLine();
        if(accType.equalsIgnoreCase("zero balance")){
            System.out.println("Enter the Account holder Name");
            String accountHolderName = sc.nextLine();
            Account1 acc = new Account1();
            acc.accountHolderName = accountHolderName;
            System.out.println("Account Details : "+acc.accountHolderName+"...."+acc.balance);
        }
        else if(accType.equalsIgnoreCase("min balance")){
            System.out.println("Enter the Account Holder Name");
            String accountHolderName = sc.nextLine();
            Account1 acc = new Account1(5000);
            acc.accountHolderName = accountHolderName;
            System.out.println("Account Details : " + acc.accountHolderName + "...." + acc.balance);
        }
    }
}
