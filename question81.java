// یک عدد را گرفته و صفر های آن را حذف کند
import java.util.Scanner;
public class question81 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = scanner.nextInt();
        int r=0;
        int p=1;
        while(n>0)
        {
            if ((n%10) != 0)
            {
                r=r+((n % 10)*p);
                p=p*10;
            }
            n=n/10;
        } // end of while
        System.out.print(r);
    } // end of main
} // end of class
