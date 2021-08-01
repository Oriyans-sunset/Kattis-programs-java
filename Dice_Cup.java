import java.util.*;
class Dice_Cup
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        s = s.trim();
        s = s.toUpperCase();
        int c = 0;
        for(int i = 0; i < s.length()-2;i=i+3)
        {
            if(i%3 == 0)
                if(s.charAt(i) != 'P')
                    c++;
                 if(s.charAt(i+1) != 'E')
                    c++;
                 if(s.charAt(i+2) != 'R')
                    c++;                
        }
        System.out.println(c);
    }    
}