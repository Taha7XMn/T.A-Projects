import java.util.Scanner;
// برنامهای بنویسید که یک عدد از 1 تا 365 را گرفته و روز جاری ماه را چاپ کند
public class q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int R=0;



        if (n<187)
        {
            if (n % 31 == 0)
                R = 31;
            if (n % 31 != 0)
                R = n % 31;
        } // end of if




        if (n>=187 && n<337)
        {
            if ((n - 186) % 30 == 0)
                R = 30;
            if ((n-186) % 30 != 0)
                R = (n-186) % 30;
        } // end of if 2




        if (n>=337)
            R = n - 336;
        System.out.print(R);
        } // end of main
} // end of class
