class Bank{

    int getInterest(){
        return 0;
    }

}

class SBI extends Bank{

    int getInterest(){
        return 4;
    }
}

class ICICI extends Bank{

    int getInterest(){
        return 5;
    }
}

public class polymorphism{

    public static void main(String[] args) {
        
        Bank ob;
        ob= new SBI();
        System.out.println("SBI interest rate");
        System.out.println(ob.getInterest());

        ob= new ICICI();
        System.out.println("ICICI interest rate");
        System.out.println(ob.getInterest());

    }
}