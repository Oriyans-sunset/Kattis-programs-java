import java.util.*;
class Cetvrta
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int m = 2;
        int sum = 0;
        while(m > 0)
        {
            for(int i = 0; i < 3; i++)
            {
                int n = Integer.parseInt(sc.next());
                arr1.add(n);
                sum = sum + arr1.get(i);
            }            
            m--;
        }
        
    }
}