// برنامهای بنوسید که یک عدد را گرفته سپس اعداد طبیعی کمتر مساوی آن را چاپ کند
import java.util.Scanner;
public class q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int x=1;x<=n;x++)
            System.out.println(x);
    } // end of main
} // end of class