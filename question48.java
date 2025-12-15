// یک عدد را گرفته و حاصلضرب ارقام آن را چاپ کند
import java.util.Scanner;
public class question48
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        int p=1;
        while (n>0)
        {
            int m=n%10;
            p=p*m;
            n=n/10;
        } // end of while
        System.out.println("Haselzarb = "+p);
    } // end of main
} // end of class
