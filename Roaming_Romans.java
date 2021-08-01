import java.util.*;
class Roaming_Romans
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double n = (double)5280/4854;
        double n1= (double)n*1000;
        double ans = (double)n1*X;
        System.out.println(Math.round(ans));
    }
}