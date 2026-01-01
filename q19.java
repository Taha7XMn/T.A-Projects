import java.util.Scanner;
// برنامه ای بنوسید که یک عدد را گرفته سپس حاصل جمع مقسوم علیه های زوج آن را چاپ کند
public class q19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int s=0;
        for (int x=1;x<=n;x++)
            if (n%x==0 && x%2==0)
                s = s+x;
        System.out.print(s);
    } // end of main
} // end of class
