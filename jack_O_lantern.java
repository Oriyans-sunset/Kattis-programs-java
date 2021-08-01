import java.util.*;
class jack_O_lantern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.trim();
        s = s + " ";
        String p ="";
        int sum = 1;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
                p = p + s.charAt(i);
            else
            {
                int num = Integer.parseInt(p);                
                sum = sum*num;
                p = "";
            }
        }
        System.out.println(sum);
    }
}