import java.util.*;
class homework
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input.trim();
        input = input + ";";
        int l = input.length();
        String p = "";
        int sum = 0;
        for(int i = 0; i<l;i++)
        {
            if(input.charAt(i) != ';')
            {
                p = p + input.charAt(i);
            }
            else
            {
                boolean check = false;
                for(int m = 0; m < p.length() ; m++)
                {
                    if(p.charAt(m) == '-')
                    {
                        check = true;
                        break;
                    }
                    else
                    {
                        check = false;
                    }
                }
                if(check == true)
                    sum = sum + numberOfQuestions_withDash(p);
                else
                    sum = sum + numberOfQuestions_withoutDash(p);                
                check = false;
                p = "";
            }
        }
        System.out.println(sum);
    }

    static int numberOfQuestions_withDash(String p)
    {
        int l = p.length();
        int num1 = 0, num2 = 0;
        for(int i = 0; i < l; i++)
        {
            if(p.charAt(i) == '-')
            {
                num1 = Integer.parseInt(p.substring(i+1));
                num2 = Integer.parseInt(p.substring(0,i));
                break;
            }
        }
        return ((num1 - num2)+1);
    }

    static int numberOfQuestions_withoutDash(String p)
    {
        return 1;
    }
}