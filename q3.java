import java.util.Scanner;
// برنامهای بنویسید که عدد n به عنوان پول درخواستی از ATM را از کاربر دریافت کرده و سپس n را به
//مبالغ 1 و 5  و 10 و 50 هزار تومانی خرد کند.
public class q3 {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int c50=0;
        int c10=0;
        int c5=0;
        int c1=0;
        if (n>0) {
            c50 = n / 50;
            n=n%50;
        } // end of if 1
        if (n>0){
            c10 = n /10;
            n=n%10;
        } // end of if 2
        if (n>0) {
            c5 = n / 5;
            n=n%5;
        } // end of if 3
        if (n>0) {
            c1 = n / 1;
            n=n%1;
        } // end of if 3
        System.out.print("C50="+c50 + " C10="+c10 + " C5="+c5 + " C1="+c1);
    } // end of main
} // end of class
