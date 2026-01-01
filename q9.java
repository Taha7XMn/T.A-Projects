// برنامهای بنوسید که حاصل جمع اعداد زوج 1 تا 100 را چاپ کند
public class q9 {
    public static void main(String[] args){
        int s=0;
        for (int x=2;x<=100;x+=2)
            s = s+x;
        System.out.print("Haseljam: " + s);
    } // end of main
} // end of class
