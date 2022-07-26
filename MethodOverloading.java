public class MethodOverloading {
    public void m1(){
        System.out.println("Zero argument method");
    }
    public int  m1(int x){
        System.out.println("int argument method");
        System.out.println("x : "+x);
        return x;
    }
    public void m1(String x){
        System.out.println("String argument method");
        System.out.println("x : "+x);
    }
    public void m1(int x , float y){
        System.out.println("int - float argument method");
        System.out.println("int x : "+x);
        System.out.println("float y :"+y);
    }
    public void m1(float y , int x){
        System.out.println("float - int argument method");
        System.out.println("float y : "+y);
        System.out.println("int x : "+x);
    }
    public static void main(String[] args){
        MethodOverloading mo = new MethodOverloading();
        mo.m1();
        mo.m1(123);
        mo.m1("Ram");
        mo.m1(23,25f);
        mo.m1(25f,23);
    }
}
