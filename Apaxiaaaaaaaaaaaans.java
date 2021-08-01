import java.util.*;
class Apaxiaaaaaaaaaaaans
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s.trim();
        s.toLowerCase();
        String p = "";
        for(int i = 0; i < s.length()-1; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 != ch2)
                p = p + ch1;
        }
        p = p + s.charAt(s.length()-1);
        System.out.print(p);
    }
}