class A{

    public void Car()
    {
        System.out.println("Audi Car");
    }
}
class B extends A{

    public void bike()
    {
        System.out.println("Duke Bike");
    }

}
class C extends B{

    public void cycle()
    {
        System.out.println("Hercules");
    }
}
public class multipleinheritance{

    public static void main(String[] args) {
        
        C ob= new C();
        ob.Car();
        ob.bike();
        ob.cycle();
    }
}