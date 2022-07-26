public class Demo {
    public static void main(String[] args){
    System.out.println("Main method");
    }
    static int a = M1();

    static int M1(){
        System.out.println("Static Method");
        System.out.println("a = " + a);
        return 123;
    }
    static{
        System.out.println("Static Block");
        System.out.println("a = " + a);
    }
}
