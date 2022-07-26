public class ThisDemo {
    int a = 111;
    int b = 333;

    void m1(){
        System.out.println("m1 Method");
        System.out.println("m1 : "+this.a+"..."+this.b);
    }
    public static void main(String[] args){
        ThisDemo td = new ThisDemo();
        System.out.println(td.a+"..."+td.b);
        td.a = 888;
        td.b = 999;
        System.out.println(td.a+"..."+td.b);
        td.m1();
    }
}
