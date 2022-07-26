interface C {
    public abstract void m10();
    public abstract void m2();
}
interface D extends C {
    public abstract void m3();
    public abstract void m4();
}

abstract class N implements D{
    public void m3(){
        System.out.println("N - m10()");
    }
}

abstract class M extends N{
    public void m4(){
        System.out.println("M - m3()");
    }
   public abstract void m5();
    public void m6(){
        System.out.println("M - m6()");
    }
}

class O extends M{

    @Override
    public void m10() {
        System.out.println("O - m10()");
    }

    @Override
    public void m2() {
        System.out.println("O - m2()");
    }

    @Override
    public void m5() {
        System.out.println("O - m5()");
    }
}
public class Test5 {
    public static void main(String[] args){
        C obj = new O();
        obj.m10();
        obj.m2();

        D obj1 = new O();
        obj1.m3();
        obj1.m4();
        obj1.m10();
        obj1.m2();

        N obj3 = new O();
        obj3.m3();

        M obj4 = new O();
        obj4.m5();
        obj4.m6();

    }
}
