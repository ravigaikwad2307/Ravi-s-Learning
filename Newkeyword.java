import javax.swing.*;

public class Newkeyword {
    int sid;
    String stname;
    Newkeyword(int id, String name){
        sid = id;
        stname = name;
        System.out.printf("ID : %d \nName : %s", sid , stname);

    }

    public Newkeyword() {
        System.out.println("No Arguments passed");
    }

    public static void main(String[] args){
        Newkeyword obj = new Newkeyword(101, "Ram");
    }


}
