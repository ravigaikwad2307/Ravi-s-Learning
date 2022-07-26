class Demo9{
    void m3(){
        System.out.println("Demo9's non-static m3() method");

    }
}
public class NonStaticMethod {
    void m1(){
        System.out.println("NonStaticMethod's non-static m1() method");
        m2();
    }
    void m2(){
        System.out.println("NonStaticMethod's non-static m2() method");
    }
    public static void main(String[] args){
        System.out.println("NonStaticMethod's main method");
        //m1();
        //m2();
        NonStaticMethod nsm = new NonStaticMethod();
        nsm.m1();
        new NonStaticMethod().m2();

        Demo9 dm = new Demo9();
        dm.m3();
        new Demo9().m3();
    }
}
