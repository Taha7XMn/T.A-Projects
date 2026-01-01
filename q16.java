import java.util.Scanner;
// برنامه ای بنوسید که یک عدد را گرفته سپس تعداد مقسوم علیه های آن را چاپ کند
public class q16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int p=0;
        for (int x=1;x<=n;x++)
            if (n%x==0)
                p = p+1;
        System.out.print(p);

    } // end of main
} // end of class
