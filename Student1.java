public class Student1 {
    int sid;
    String sname;
    double sfee;

    Student1(){
        System.out.println("zero argument constructor");
    }
    Student1(int id){
        sid = id;
        System.out.println("int argument constructor");
    }
    Student1(String name){
        sname = name;
        System.out.println("String Argument Constructor");
    }
    Student1(double fee){
        sfee = fee;
        System.out.println("double Argument Constructor");
    }
    Student1(int id, String name , double fee){
        sid = id ;
        sname = name;
        sfee = fee;
    }

    public static void main(String[] s){
        Student1 s0 = new Student1();
        System.out.println(s0.sid+"...."+s0.sname+"...."+s0.sfee);
        Student1 s1 = new Student1(123);
        System.out.println(s1.sid+"...."+s1.sname+"...."+s1.sfee);
        Student1 s2 = new Student1("Ram");
        System.out.println(s2.sid+"...."+s2.sname+"...."+s2.sfee);
        Student1 s3 = new Student1(5000.00);
        System.out.println(s3.sid+"...."+s3.sname+"...."+s3.sfee);
        Student1 s4 = new Student1(23,"Ram",50000.00);
        System.out.println(s4.sid+"...."+s4.sname+"...."+s4.sfee);

    }
}
