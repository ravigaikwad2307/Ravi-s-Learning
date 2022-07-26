public class A2 {
    int a = 111;
    int b = 333;

    A2(){

    }
    A2(A2 ref){
        this.a = ref.a;
        this.b = ref.b;
    }

    public static void main(String[] args){
        A2 obj = new A2();
        System.out.println("obj.a : "+obj.a);
        System.out.println("obj.b : "+obj.b);
        obj.a = 777;
        obj.b = 999;
        System.out.println("----------");
        System.out.println("obj.a : "+obj.a);
        System.out.println("obj.b : "+obj.b);

        A2 obj2 = new A2();
        System.out.println("----------");
        System.out.println("obj2.a : "+obj2.a);
        System.out.println("obj2.b : "+obj2.b);

        A2 obj3 = obj;
        System.out.println("----------");
        System.out.println("obj3.a : "+obj3.a);
        System.out.println("obj3.b : "+obj3.b);

        A2 obj4 = new A2(obj);
        System.out.println("----------");
        System.out.println("obj4.a : "+obj4.a);
        System.out.println("obj4.b : "+obj4.b);

    }
}
