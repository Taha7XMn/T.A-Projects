// یک عدد را گرفته و آن را به عوامل اول تجزیه کند
import java.util.Scanner;
public class question59 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        int m=2;
        int k;
        while (n>1)
        {
            k=0;
            while (n%m==0)
            {
                n=n/m;
                k++;
            }//end of while2
            if (k > 0)
                System.out.print(m+"^"+k+"*");
            m++;
        } // end of while1
    } // end of main
} // end of class


