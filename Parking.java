import java.util.*;
class Parking
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int testCases[] = new int[t];
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int arr[] =  new int[n];
            for(int m = 0; m < n; m++)
            {
               arr[m] = sc.nextInt();
            }
            int swap = 0;
            for(int m = 0; m < n; m++)
            {
                for(int p = 0; p < (n-1); p++)
                {
                    if(arr[p] > arr[p+1])
                    {
                        swap = arr[p+1];
                        arr[p+1] = arr[p];
                        arr[p] = swap;
                    }
                }
            }
            int smallest = arr[0];
            int largest = arr[n-1];
            int ans = (largest - smallest)*2;
            testCases[i]= ans;
        }
        for(int i = 0; i < t; i++)
        {
             System.out.println(testCases[i]);
        }
    }
}