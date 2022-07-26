public class B1 extends A1{
    static int a = m2();

    static {
        System.out.println("Static block of B1");
    }

    static int m2(){
        System.out.println("Static method of B1");
        return 222;
    }
    public static void main(String[] args){
        System.out.println("Main method of B1");
    }
}
