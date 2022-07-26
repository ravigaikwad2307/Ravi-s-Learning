public class LocalVar {
    static int a = 1;
    int b = 2;
    public static void main(String[] args){
        LocalVar lv = new LocalVar();
        int c;
        System.out.println("a = "+a);
        System.out.println("b = "+lv.b);
        //System.out.println("c = "+c);   not possible we should initialize local variable int c=0;


    }
}
