import java.util.Scanner;
// برنامه ای بنوسید که یک عدد را گرفته سپس فاکتورریل آن را محاسبه و چاپ کند
public class q25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int p=1;
        for (int x=1;x<=n;x++)
            p = p*x;
        System.out.print("N!= "+p);
    } // end of main
} // end of class
