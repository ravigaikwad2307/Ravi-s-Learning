interface I{
    public abstract void m1();
}

interface J extends I{
    public abstract void m2();
}
class Z implements J{
    public void m1(){
        System.out.println("m1() : I");
    }

    public void m2() {
        System.out.println("m2() : J");
    }
}

public class Test2 {
    public static void main(String[] args){
        Z a = new Z();
        a.m1();
        a.m2();
    }
}
