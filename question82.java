// عدد را گرفته و معادل آن در مبنای 2 را چاپ کند
import java.util.Scanner;
public class question82 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        int p=1;
        long r=0;
        while (n > 0)
        {
            int q=n%2;
            r=r+(q*p);
            p*=10;
            n=n/2;
        } // end of while
        System.out.print("n dar mabnaye 2= "+r);
    } // end of main
} // end of class


