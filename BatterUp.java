import java.util.*;
class BatterUp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        s.trim();
        s = s + " ";
        String p ="";
        int c = 0, sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
                p = p + s.charAt(i);
            else
            {
                int num = Integer.parseInt(p);                
                if(num != -1)
                {
                    sum = sum + num;
                    c++;
                }
                p = "";
            }
        }
        System.out.println((double)sum/c);
    }
}