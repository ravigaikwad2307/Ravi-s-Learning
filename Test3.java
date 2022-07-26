interface L{
    public static final int a = 111 ;
    public abstract void m1();
}
interface K{
    public abstract void m1();
    public static int a = 333;
}

class A4 implements L,K{
    public void m1(){
        System.out.println("A : m1()");
    }
}
public class Test3 {
    public static void main(String[] args){
        A4 a = new A4();
        a.m1();
        System.out.println("L : a = "+L.a);
        System.out.println("K : a = "+K.a);
        L obj1 = new A4();
        System.out.println("L : a : = "+obj1.a);
        obj1.m1();
        K obj2 = new A4();
        System.out.println("K : : a = "+obj2.a);
        obj2.m1();

    }
}
