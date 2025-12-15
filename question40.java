// چاپ 50امین عدد اول
public class question40 {
    public static void main(String[] args)
    {
        int p=0;
        int x=1;
        while(p<50)
        {
            int c=0;
            for (int y=1;y<=x;y++)
            {
                if (x%y==0)
                    c++;
            } // end of for
            if (c==2)
                p++;
            x++;
        }//end of while
        System.out.print("50 omin adad avval ="+(x-1));
    } // end of main
} // end of class
