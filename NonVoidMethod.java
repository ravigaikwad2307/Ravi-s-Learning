public class NonVoidMethod {
    boolean m1(){
        System.out.println("boolean.m1()");
        return true;
    }
    public static void main(String[] args){
        NonVoidMethod nvm = new NonVoidMethod();
        nvm.m1();
        System.out.println(nvm.m1());
        boolean b1 = nvm.m1();
        System.out.println("b1 : "+b1);
    }
}
