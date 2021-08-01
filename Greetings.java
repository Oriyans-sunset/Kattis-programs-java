import java.util.*;
class Greetings
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        s.trim();
        String p = "h";
        int e = 0;
        for(int i = 0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'e')
            e++;
        }
        for(int i = 0; i < (e*2);i++)
        {
            p = p + 'e';
        }
        p = p + 'y';
        System.out.println(p);
    }
}