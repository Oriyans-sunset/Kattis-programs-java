import java.util.*;
class No_Duplicates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "";
        s.trim();
        s = s + " ";
        int l = s.length();
        String w = "";
        String x = "";
        int c = 0;

        for(int i = 0; i < l; i++)
        {
            if(s.charAt(i) != ' ')
            {
                p = p + s.charAt(i);

            }
            else
            {
                c++;
                p = "";
            }
        }
        int numberOfWords = c;
        String arr[] = new String[numberOfWords];
        int f = 0;
        for(int i = 0; i < l; i++)
        {
            if(s.charAt(i) != ' ')
            {
                p = p + s.charAt(i);                
            }
            else
            {
                arr[f] = p;
                f++;
                p = "";
            }
        }
        int ans = 0;
        for(int i = 0; i < numberOfWords; i++)
        {
            for(int m = i+1; m < numberOfWords; m++)
            {
                if(arr[i].equals(arr[m]))
                {
                    ans = 1;
                }
            }
        }
        if(ans == 1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}