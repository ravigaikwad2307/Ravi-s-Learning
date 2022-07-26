public class NewInstanceDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        java.lang.Class cls = Class.forName(args[0]);
        Object o = cls.newInstance();

        if(o instanceof A){
            System.out.println("A class object");
            A obj1 = (A)o;
            System.out.println(obj1.a);
        }
        else if(o instanceof B){
            System.out.println("B Class Object");
            B obj1 = (B)o;
            System.out.println(obj1.b);
        }


    }
}
