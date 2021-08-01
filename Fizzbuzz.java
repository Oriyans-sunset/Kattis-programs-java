import java.util.*;
class Fizzbuzz
{
    static int N, X, Y;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         X = sc.nextInt();
         Y = sc.nextInt();
         N = sc.nextInt();
        for(int i = 1; i <= N; i++)
        {
            if(fizz_buzz(i) == true)
            {
                System.out.println("fizzbuzz");
                continue;
            }
            if(fizz(i) == true)
            {
                System.out.println("fizz");
                continue;
            }
            if(buzz(i) == true)
            {
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    static boolean fizz(int n)
    {
        if(n%X == 0)
            return true;
        else 
            return false;
    }
    static boolean buzz(int n)
    {
        if(n%Y == 0)
            return true;
        else 
            return false;
    }
    static boolean fizz_buzz(int n)
    {
        if(n%Y == 0 && n%X == 0)
            return true;
        else 
            return false;
    }
}