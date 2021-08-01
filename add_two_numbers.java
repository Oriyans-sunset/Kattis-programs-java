import java.util.*;
class add_two_numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a <= 1000000 && a >= 0 && b <= 1000000 && b >= 0){
            int sum = a + b;
            System.out.println(sum);
        }
    }
}