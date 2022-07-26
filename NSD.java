public class NSD {
    int a  = M1();
    {
        System.out.println("NSB 2");
    }
    public static void main(String[] args){
        System.out.println("Main Method");
        new NSD();

    }
    int M1(){
        System.out.println("M1 Method");
        System.out.println("a = "+a);
        return 111;
    }
    NSD(){
        System.out.println("Constructor");
    }
    {
        System.out.println("NSB 1");
    }

}
