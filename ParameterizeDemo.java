
class Demo10{
    int a = 111;
    int b = 333;
}
public class ParameterizeDemo {
    void m1(boolean b){
        System.out.println("boolean method "+b);
    }
    void m2(String s){
        System.out.println("String method "+s);
    }
    void m3(int[] a){
        System.out.println("int[] method");
        System.out.println("a : "+a);
        for (int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    void m4(Demo10 obj){
        System.out.println("ParameterizeDemo's m4");
        System.out.println("Demo10 : "+obj.a+"......."+obj.b);
    }
    public static void main(String[] args){
        ParameterizeDemo pd = new ParameterizeDemo();
        pd.m1(true);
        pd.m2("Ram");
        pd.m3(new int[] {1,2,3,4,5});
        int[] ia = {11,22,33,44,55};
        pd.m3(ia);
        Demo10 d = new Demo10();
        pd.m4(d);

    }

}
