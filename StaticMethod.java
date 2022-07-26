class Demo8{
    static void m2(){
        System.out.println("Demo8's static method");
    }
}
public class StaticMethod {
    static void m1(){
        System.out.println("StaticMethod's static method m1()");
    }
    public static void main(String[] args){
        m1();
        StaticMethod.m1();

        StaticMethod stm = new StaticMethod();
        stm.m1();
        new StaticMethod().m1();
        System.out.println("----------");
        //m2();
        Demo8.m2();
        Demo8 dm = new Demo8();
        dm.m2();
        new Demo8().m2();


    }
}
