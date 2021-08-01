import java.util.*;
class Ladder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double v = sc.nextInt();
        double sinVal = (Math.sin(Math.toRadians(v)));
        double answer = h/sinVal;
        System.out.println((int)Math.ceil(answer));
    }
}