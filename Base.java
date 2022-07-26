// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base
{
    String name;

    // constructor 1
    Base()
    {
        this("Ravi");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
        System.out.println(name);
    }
}

class Derived extends Base
{
    // constructor 3
    Derived()
    {
        new Derived("Ram");
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
        System.out.println(name);
    }

    public static void main(String args[])
    {
        // calls parameterized constructor 4
        //Derived obj = new Derived("test");

        // Calls No-argument constructor
        Derived obj = new Derived();
    }
}
