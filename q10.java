// برنامهای بنوسید که حاصل جمع اعداد فرد 1 تا 100 را چاپ کند
public class q10 {
    public static void main(String[] args){
        int s=0;
        for (int x=1;x<100;x+=2)
            s = s+x;
        System.out.print("Haseljam: "+s);
    } // end of main
} // end of class
