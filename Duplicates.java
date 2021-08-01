import java.util.*;
class Duplicates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        s.trim();
        String dupStr = "";
        String newStr = "";
        for(int i = 0; i < s.length(); i++)
        {
            String ch = Character.toString(s.charAt(i));
            if(newStr.contains(ch))
            {
                if(!dupStr.contains(ch))
                {
                    dupStr = dupStr + ch;
                }
            }
            newStr = newStr + ch;
        }
        System.out.println(dupStr);
    }
}