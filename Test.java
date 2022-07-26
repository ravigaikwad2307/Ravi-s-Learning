interface  Vehicle {
    public abstract void windows();

    public abstract void ac();
}

class Car implements Vehicle{
    public void windows(){
        System.out.println("Car : windows 6");
    }
    public void ac(){
        System.out.println("Car requires ac");
    }
}
class Lorry implements Vehicle{
    public void windows(){
        System.out.println("Lorry : windows 4");
    }
    public void ac(){
        System.out.println("Lorry : not requires ac");
    }
}
abstract class Bus implements Vehicle{
    public void windows(){
        System.out.println("Bus : windows 50");
    }
    public abstract void ac();

}
class SetWin extends Bus {
    public void ac(){
        System.out.println("SetWin : Not requires ac");
    }
}
class Volvo extends Bus{
    public void ac(){
        System.out.println("Volvo : Requires ac");
    }
}
    public class Test {

    public static void main(String[] args){
        Car c = new Car();
        c.windows();
        c.ac();
        Lorry l = new Lorry();
        l.windows();
        l.ac();
        SetWin s = new SetWin();
        s.ac();
        Volvo v = new Volvo();
        v.ac();
    }
    }

