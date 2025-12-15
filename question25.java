// یک عدد را گرفته و فاکتوریل آن را چاپ کند
import java.util.Scanner;
public class question25 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=input.nextInt();
        int p=1;
        for (int x=1;x<=n;x++)
            p=p*x;
        System.out.print("n!= "+p);
    }
}
