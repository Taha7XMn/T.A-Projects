import java.util.Scanner;
// برنام های بنوسید که یک عدد را گرفته سپس میانگین مقسوم علیه های زوج آن را چاپ کند
public class q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int s = 0;
        int p = 0;
        for (int x = 1; x <= n; x++)
            if (n % x == 0 && x % 2 == 0)
            {
                s = s + x;
                p++;
            } // end of if
        System.out.print(1.0*s/p);
    } // end of main
} // end of class
