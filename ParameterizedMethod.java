public class ParameterizedMethod {
    void m1(){
        System.out.println("Non Parameterized method");
    }
    void m2(int x){
        System.out.println("Parameterized method");
        System.out.println("X : "+x);
    }
    public static void main(String[] args){
          ParameterizedMethod pm = new ParameterizedMethod();
          pm.m1();
          pm.m2(23);
    }
}
