class Super{
    int a = 111;
    static int b = 333;
    void m1(){
        System.out.println("Super m1() method");
    }
    static void m2(){
        System.out.println("Super static m2() method");
    }
}
class Subclass extends Super{
    int a = 555;
    static int b = 777;
    void m1(){
        int a = 999;
        System.out.println("Subclass m1() method");
        System.out.println("a : "+a); // local
        System.out.println("a : "+this.a); //present class
        System.out.println("a : "+super.a); //super class
        m2(); //this.m2();
        this.m2(); //present class
        super.m2(); //super class
        //m1()   this.m1()
        super.m1(); //super class
    }
    static void m2(){
        System.out.println("Subclass static m2() method");
    }
}

public class Demo7 {
    public static void main(String[] args){
        Subclass sc = new Subclass();
        sc.m1();
    }
}
