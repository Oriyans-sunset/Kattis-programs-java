import java.util.*;
class take_two_stones
{
    static int N;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N%2 == 0)
        {
            System.out.println("Bob");
        }
        else
        {
            System.out.println("Alice");
        }
    }
}