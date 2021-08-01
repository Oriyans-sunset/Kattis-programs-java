import java.util.*;
class FYI
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n = n.trim();
        int c = 0;
        if(n.charAt(0) == '5')
            c++;
        if(n.charAt(1) == '5')
            c++;
        if(n.charAt(2) == '5')
            c++;
        if(c == 3)
            System.out.println(1);
        else
            System.out.println(0);
    }
}