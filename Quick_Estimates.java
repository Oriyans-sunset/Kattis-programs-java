import java.util.*;
class Quick_Estimates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 1 || N > 100)
            System.exit(0);
        
        for(int i = 0; i < N; i++)
        {
            int num = sc.nextInt();
            if( num < 0 || num > (int)Math.pow(10,100))
                System.exit(0);
            System.out.println(String.valueOf(num).length());
        }
        
    }
}