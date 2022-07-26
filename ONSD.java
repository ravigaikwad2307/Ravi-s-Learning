public class ONSD {
    int a = 111;
    int b = 333;
    public static void main(String[] args){
        ONSD od1 = new ONSD();
        ONSD od2 = new ONSD();

        System.out.println("od1 :"+od1.a+" ----- "+od1.b);
        System.out.println("od2 :"+od2.a+" ----- "+od2.b);

        od1.a = 222;
        od1.b = 444;
        System.out.println("od1 :"+od1.a+" ----- "+od1.b);
        System.out.println("od2 :"+od2.a+" ----- "+od2.b);

        od2.a = 555;
        od2.b = 666;

        System.out.println("od1 :"+od1.a+" ----- "+od1.b);
        System.out.println("od2 :"+od2.a+" ----- "+od2.b);

    }
}
