public class Demo6 {
    static{
        //System.out.println("Static Block : "+this.hashCode());
    }
    {
        System.out.println("Non-Static Block : "+this.hashCode());
    }
    Demo6(){
        System.out.println("Constructor : "+this.hashCode());
    }
    void m1(){
        System.out.println("m1 Method : "+this.hashCode());
    }
    public static void main(String[] args){
        //System.out.println("Main : "+this.hashCode());
        Demo6 d = new Demo6();
        System.out.println("d : "+d.hashCode());
        Demo6 d1 = new Demo6();
        System.out.println("d1 : "+d1.hashCode());
    }
}
