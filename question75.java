// جدول ضرب مبنای 8
public class question75 {
    public static void main(String[] args)
    {
        for (int n=1;n<=8;n++)
        {
            for (int m=1;m<=8;m++)
            {
                if ((n*m)<10)
                    System.out.print("  "+n*m);
                else
                    System.out.print(" "+n*m);
            } // end of for 2
            System.out.println();
        } // end of for 1
    } // end of main
} // end of class
