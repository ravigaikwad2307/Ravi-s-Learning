import org.w3c.dom.ls.LSOutput;

class Course{
    String insName = "NIT";
}
class Java extends Course{
    String cname = "Java";
    int cfee = 2500;
}
class Python extends Course{
    String cname = "Python";
    int cfee = 3000;
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Java j = new Java();
        System.out.println(j.insName);
        System.out.println(j.cname);
        System.out.println(j.cfee);

        Python p = new Python();
        System.out.println(p.insName);
        System.out.println(p.cname);
        System.out.println(p.cfee);
    }


}