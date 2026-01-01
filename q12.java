import java.util.Scanner;
//  برنامه ای بنوسید که یک عدد را گرفته سپس مقسوم علیه های آن را چاپ کند
public class q12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int x=1;x<=n;x++)
            if (n%x==0)
                System.out.println(x);
    } // end of main
} // end of class
