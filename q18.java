import java.util.Scanner;
// برنامه ای بنوسید که یک عدد را گرفته سپس تعداد مقسوم علیه های فرد آن را چاپ کند
public class q18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int p=0;
        for (int x=1;x<=n;x++)
            if (n%x==0 && x%2==1)
                p++;
        System.out.print(p);

    } // end of main
} // end of class
