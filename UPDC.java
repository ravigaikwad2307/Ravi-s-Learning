class Up{
    int a = 111;
    static int b = 222;
    void m1(){
        System.out.println("Super class non static m1()");
    }
    static void m2(){
        System.out.println("Super class static m2()");
    }
}

class Dc extends Up{
    int a = 333;
    static int b = 444;

    void m1(){
        System.out.println("Sub class non static m1()");
    }
    static void m2(){
        System.out.println("Sub class static m2()");
    }
    void m3(){
        System.out.println("Sub class non static m3()");
    }
    static void m4(){
        System.out.println("Sub class static m4()");
    }
}

public class UPDC {
    public static void main(String[] args){
        Up obj = new Dc();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.m1();
        obj.m2();

        System.out.println("------------------------");

        Dc obj2 = (Dc)obj;
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        obj2.m1();
        obj2.m2();
        obj2.m3();
        obj2.m4();

    }
}
