
class Emp{
    String emp = "Ram";
}
class ITCompany{
    private ITCompany(){

    }
    String itc = "Naresh Technology";

    //public
    static ITCompany getObjectForITCompany(){
        return new ITCompany();
    }

    Emp getObjectForEmp(){
        return new Emp();
    }
}
public class FDemo {
    public static void main(String[] args){
        ITCompany itc1 = ITCompany.getObjectForITCompany();
        System.out.println("IT Company = " +itc1.itc);
        Emp e = itc1.getObjectForEmp();
        System.out.println("Employee Name = " +e.emp);
    }
}
