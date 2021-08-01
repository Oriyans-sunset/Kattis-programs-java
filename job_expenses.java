import java.util.*;
class job_expenses
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            if(num<=0)
                sum = sum + num;
        }
        System.out.println(Math.abs(sum));
    }
}