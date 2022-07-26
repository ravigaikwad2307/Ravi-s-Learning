class A{
    public int a;
    int b = 333;
}

public class NSDemo {

    int a =111;
    {
        System.out.println("NSB : a: "+a);
    }
    NSDemo(){
        System.out.println("Constructor : a: " +a);
    }
    void M1(){
        System.out.println("Method : a :"+a);
    }

    public static void main(String[] args){
       // System.out.println("By directly  a = "+a);
       NSDemo nsd = new NSDemo();
       nsd.M1();
       System.out.println("By anonymous Object a = "+new NSDemo().a);
       System.out.println("By reference a = "+nsd.a);

       A a1 = new A();
        System.out.println("By anonymous Object b = "+new A().b);
        System.out.println("By reference b = "+a1.b);
    }

}
