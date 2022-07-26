
public class Z1 {
    int a;
    public int getA(){
        return a;
    }
    Z1(int a){
        this.a = a;
    }

    public class Y extends Z1{
        Y(int b){
            super(b);
            System.out.println(" I am Constructor");
        }
    }

    public static void main(String[] args) {
        Z1  o =  new Z1(65);
        //Y  ob =  new Y(55);
        System.out.println(o.getA());
    }
}
