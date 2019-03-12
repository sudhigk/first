import java.util.Scanner;
public class Addtwo{

    public static void main(String[] args) {
    
        Scanner myInput= new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter a number:");

        a=myInput.nextInt();
        System.out.print("Enter the second number;");
        b=myInput.nextInt();
        c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
}