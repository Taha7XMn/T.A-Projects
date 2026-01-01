import java.util.Scanner;
// رنامهای بنویسید که یک عدد از 1 تا 365 را گرفته و ماه جاری را چاپ کند
public class q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int R=0;

        // 6 ماه اول

        if (n<187) {
            if (n % 31 == 0)
                R = n / 31;

            if (n%31!=0)
                R = n/31 + 1;
        } // end of if n<187

        // 5 ماه دوم

        if (n>=187 && n<337) {
            if ((n - 186) % 30 == 0)
                R = ((n-186)/30) + 6;

            if ((n-186) % 30 != 0)
                R = ((n-186)/30) + 6 + 1;

        // ماه آخر

        } // end of if n>=187 && n<337
        if (n>=337)
            R = 12;



        System.out.print(R);
    } // end of main
} // end of class
