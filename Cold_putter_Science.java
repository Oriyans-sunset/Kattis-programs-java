import java.util.*;
class Cold_putter_Science
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        input.trim();
        input = input + " ";
        String p = "";
        int c = 0;
        for(int i = 0; i < input.length();i++)        
        {
            if(input.charAt(i) != ' ')
                p = p+input.charAt(i);
            else
            {
                int num = Integer.parseInt(p);
                if(num < 0)
                    c++;
                p = ""; 
            }
        }
        System.out.println(c);
    }
}