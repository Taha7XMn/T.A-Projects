// 50 جمله اول دنباله فیبوناچی
public class question41 {
    public static void main(String[] args)
    {
        long a=1;
        long b=1;
        long c=0;
        int k=2;
        while(k<50)
        {
            c=a+b;
            k++;
            a=b;
            b=c;
        } // end of while
        System.out.print("Result : "+c);
    } // end of main
} // end of class
