import java.util.Scanner;

// برنامه ای بنوسید که یک عدد را گرفته سپس میانگین مقسوم علیه های آن را چاپ کند
public class q21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int s=0;
        int p=0;
        for (int x=1;x<=n;x++)
            if (n%x==0) {
                s = s + x;
                p++;
            } // end of main
        System.out.print(1.0*s/p);
    } // end of main
} // end of class
