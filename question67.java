// 100 عدد را گرفته سپس تعداد اعدادی را که با مقلوبشان برابرند را چاپ کند
import java.util.Scanner;
public class question67 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        for (int m=1;m<=100;m++)
        {
            System.out.print("Enter "+m+"st Num:");
            int n=scanner.nextInt();
            int temp=n;
            int rev=0;
            while (n>0)
            {
                int r=n%10;
                rev=rev*10+r;
                n=n/10;
            } // end of while
            if (rev==temp)
                c++;
        } // end of for
        System.out.println("Tedad = "+c);
    } // end of main

} // end of class
