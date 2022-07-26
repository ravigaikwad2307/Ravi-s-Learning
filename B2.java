 class A2 {
    A2(){
        System.out.println("A2 : zero argument constructor");
    }
    A2(int x){
        System.out.println("A2 : int argument constructor");
    }
    A2(String x){
        System.out.println("A2 : String argument constructor");
    }

 public class static B2 extends A2{
        B2(){
            System.out.println("B2 : zero argument constructor");
        }
        B2(int x){
            System.out.println("B2 : int argument constructor");
        }
        B2(String x){
            System.out.println("B2 : String argument constructor");
        }

        public static void main(String[] s){
            new B2();
        }
    }
}
