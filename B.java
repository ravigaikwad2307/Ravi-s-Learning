public class B implements Cloneable{
    int a = 111;
    int b = 222;

    public static void main(String[] arg) throws CloneNotSupportedException {
        B obj = new B();
        System.out.println("obj :"+obj.a +"..."+obj.b);

        obj.a = 888;
        obj.b = 999;
        System.out.println("obj :"+obj.a +"..."+obj.b);

        B obj1 = new B();
        System.out.println("obj1 :"+obj1.a +"..."+obj1.b);

        Object o = obj.clone();
        B obj2 = (B)o;

        System.out.println("obj2 :"+obj2.a +"..."+obj2.b);

        System.out.println("obj:"+obj.hashCode());
        System.out.println("obj2:"+obj2.hashCode());



    }
}
