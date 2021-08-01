import java.util.*;
class Speed_Limit
{
    public static void main(String args[])
    {
        int ans[] = new int[10];
        int i;
        for(i = 0; i < 10; i++){
            Scanner sc= new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            if(n == -1)
                break;
            int s, t;
            int speed[] = new int[n];
            int time[] = new int[n];
            for( int m = 0 ;m < n; m++)
            {
                String set = sc.nextLine();
                s = Integer.parseInt(set.substring(0,2));
                t = Integer.parseInt(set.substring(3));
                speed[m] = s;
                time[m] = t;
            }
            int sum = 0, g = 0;
            for(int j = 0; j<n; j++)
            {
                if(j > 0)
                    g = time[j-1];
                sum = sum + (speed[j] * (time[j] - g));
            }
            ans[i] = sum;
        }
        for( int j = 0; j < i; j++)
        {
            System.out.println(ans[j]+" miles");
        }
    }
}