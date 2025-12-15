import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int m=0;
        for(int a=1;a<=7;a++)
            for(int b=1;b<=7;b++)
            {
                m=a*b;
                int s=0;
                int p=1;
                while (c>0)
                {
                    int d=m%8;
                    s=(d*p)+s;
                    p=p*10;
                    m=m/8;
                }//end of while
                System.out.println(s);
            } // end of for2
    } // end of main
} // end of class

