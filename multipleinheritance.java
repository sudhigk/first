interface Parent1{
    
    default void car(){
       
        System.out.println("Audi Car");

    }
}
interface Parent2{

    default void car(){

        System.out.println("BMW car");
        
    }
}
public class multipleinheritance implements Parent1,Parent2{

    public void car(){

        Parent1.super.car();

    }

    public static void main(String[] args) {
        
        multipleinheritance d=new multipleinheritance();
        d.car();
    }
}