import java.util.*;
public class Pet
{
    public static void main(String args[])
    {
        int m = 0;
        int winner[] = new int[5];
        int grades[] = new int[5];
        while(m < 5)
        {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            input.trim();
            input = input + " ";
            String p = "";            
            int sum = 0;
            for(int i=0; i < input.length(); i++)
            {
                if(input.charAt(i) != ' ')
                    p = p + input.charAt(i);
                else
                {
                    int n = Integer.parseInt(p);
                    sum =  sum + n;
                    p = "";
                }
            }
            winner[m] = sum;
            grades[m] = sum;
            m++;
        }
        int swap = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = i+1 ; j < 4; j++)
            {
                if(winner[i] < winner[j])
                {
                    swap = winner[i];
                    winner[i] = winner[j];
                    winner[j] = swap;
                }
            }
        }
        for(int k = 0; k < 5; k++)
        {
            if(winner[0] == grades[k])
            {
                System.out.println((k+1)+" "+winner[0]);
                break;
            }
        }
        System.exit(0);
    }
}