public class Demo5 {

    public Demo5(){
        this(123);
        System.out.println("Demo4 zero arg");
    }
    Demo5(int x){
        new Demo5("Ram");
        System.out.println("Demo4 int arg");
        System.out.println("X : "+x);
    }
    Demo5(String x){
        System.out.println("Demo4 String arg");
        System.out.println("X : "+x);
    }
    public static void main(String[] args){
        Demo5 d = new Demo5();
    }
}
