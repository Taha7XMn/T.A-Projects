import java.util.Scanner;
// برنامهای بنوسید که یک عدد را گرفته سپس اگر اول بود "Yes "اگر اول نبود "No "چاپ کند
public class q24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int c=0;
        for (int x=1;x<=n;x++)
            if (n%x==0)
                c++;
        if (c==2)
            System.out.print("Yes");
        else
            System.out.print("No");
    } // end of main
} // end of class
