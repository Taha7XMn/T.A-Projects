// یک عدد را گرفته و بررسی کند که اول است یا نه
import java.util.Scanner;
public class question24 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = scanner.nextInt();
        int c=0;
        for (int x=1;x<=n;x++)
        {
            if (n%x==0)
                c++;
        } // end of for
        if (c==2)
            System.out.print("Yes");
        else
            System.out.print("No");
    } // end of main
} // end of class