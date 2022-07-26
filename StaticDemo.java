class Demo4 {
    static int b =333;

}

    public class StaticDemo {

    static int a = 111;
    public static void  main(String[] args){
        System.out.println("By directly : "+a);
        System.out.println("By Classname : "+StaticDemo.a);
        StaticDemo d = new StaticDemo();
        System.out.println("By Object :"+new StaticDemo().a);
        System.out.println("By reference : "+d.a);

        System.out.println("------------------");
        //System.out.println("By directly : "+b);
        System.out.println("By Classname : "+Demo4.b);
        Demo4 d1 = new Demo4();
        System.out.println("By Object :"+new Demo4().b);
        System.out.println("By reference : "+d1.b);

    }
}
