import java.util.*;
class Bijele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input.trim();
        input = input + " ";
        String p = "";
        int set[] = new int[6];
        int c = 0;
        for( int  i = 0; i < input.length() ;i++)
        {
            if( input.charAt(i) != ' ')
            {
                p = p + input.charAt(i);
            }
            else
            {
                set[c] = Integer.parseInt(p);
                c++;
                p = "";
            }
        }

        if(set[0] != 1){
            int a = set[0];
            set[0] = (1-a);
        }            
        else
            set[0] = 0;
        if(set[1] != 1){
            int a = set[1];
            set[1] = (1-a);
        }
        else
            set[1] = 0;
        if(set[2] != 2){
            int a = set[2];
            set[2] = (2-a);
        }
        else
            set[2] = 0;
        if(set[3] != 2){
            int a = set[3];
            set[3] = (2-a);
        }
        else
            set[3] = 0;
        if(set[4] != 2){
            int a = set[4];
            set[4] = (2-a);
        }
        else
            set[4] = 0;
        if(set[5] != 8){
            int a = set[5];
            set[5] = (8-a);
        }
        else
            set[5] = 0;
        String ans = "";
        for(int i = 0; i < 6; i++)
            ans  = ans + set[i] + " ";
        ans.trim();
        System.out.println(ans);
    }
}