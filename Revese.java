import java.util.Scanner;

public class Revese{
    public static void main(String[] args) {
        Scanner myInput=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter a number");
        a=myInput.nextInt();
        while(a>0)
        {
            b=a%10;
            c=b+c*10;
            a=a/10;

        }
        System.out.println(c);
    }
}