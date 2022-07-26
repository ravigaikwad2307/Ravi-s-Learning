public class VoidMethod {
    static void m1(){
        System.out.println("Void Method m1()");
        int a = 111;
        int b = 333;
        return;
        //return 23;
    }
    public static void main(String[] args){
        System.out.println("main method");
        m1();
        //System.out.println(m1());
        //int a = m1();
    }
}
