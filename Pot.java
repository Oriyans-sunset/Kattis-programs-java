import java.util.*;
class Pot
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int P;
        int arr[] = new int[N];
        int X = 0;
        for(int i = 0; i < N; i++)
        {
            P = sc.nextInt();
            if(P >= 10 && P <= 9999)
            {
                arr[i] = P;
            }
            else
            {
                System.out.println("Wrong input");
                System.exit(0);
            }
        }
        for(int i = 0; i < N; i++)
        {
            X = X + number_raised_to_power(arr[i]);
        }
        System.out.println(X);
    }
    static int number_raised_to_power(int n)
    {
        int power = n%10;
        n = n/10;
        int ans = (int)Math.pow(n,power);
        return ans;
    }
}