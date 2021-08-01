import java.util.*;
class IsItHalloween_com
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        if((s.equals("OCT") && n == 31) ||(s.equals("DEC") && n == 25))
            System.out.println("yup");            
        else
            System.out.println("nope");
    }
}