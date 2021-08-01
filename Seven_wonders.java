import java.util.*;
class Seven_wonders
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s.trim();
        int l = s.length();
        int t = 0, c = 0, g = 0, ans = 0;
        for(int i =0 ; i < l; i++)
        {
            char ch = s.charAt(i);
            switch(ch){
                case 'T': t++;
                break;
                case 'C': c++;
                break;
                case 'G': g++;
                break;
                default: break;
            }
        }
        ans = (int)(Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2));
        while( t >= 1 && c >= 1 && g >= 1)
        {
            t--;
            g--;
            c--;
            ans = ans + 7;
        }
        System.out.println(ans);
    }
}