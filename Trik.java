import java.util.*;
class Trik
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String key = "key";
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,key);
        hs.put(2, "");
        hs.put(3, "");
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
            {
                hs.put(2, key);
                hs.put(1, "");
                hs.put(3, "");
            }
            if(ch == 'B')
            {
                hs.put(3, key);
                hs.put(2, "");
                hs.put(1, "");
            }
            if(ch == 'C')
            {
                hs.put(3, "");
                hs.put(2, "");
                hs.put(1, key);
            }
        }
        String s1 = hs.get(1);
        String s2 = hs.get(2);
        String s3 = hs.get(3);
        if(s1.equals(key))
            System.out.println("1");
        else if(s2.equals(key))
            System.out.println("2");
        else
            System.out.println("3");

    }
}