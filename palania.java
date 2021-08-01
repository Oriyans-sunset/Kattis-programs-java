import java.util.*;
class palania
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int side = 2;
        for(int i = 0; i < N; i++)
        {
            side = side + side - 1;
        }
        System.out.println((int)Math.pow(side,2));
    }
}