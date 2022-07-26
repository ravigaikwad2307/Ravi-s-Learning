import org.w3c.dom.ls.LSOutput;

public class NSI{
    public static void main(String[] args){
        System.out.println("Main Method");
        new NSI();
    }
    int a = M1();


    int M1(){
        System.out.println("NS Method");
        System.out.println("a = " +a);
        return 111;

    }

    {
        System.out.println("NS Block");
        System.out.println("a = " +a);
    }
    NSI(){
        System.out.println("Constructor");
    }

}