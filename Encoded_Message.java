import java.util.*;
class Encoded_Message
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int m = 0; m < n; m++)
        {
            String s = sc.next();
            int l = s.length();
            int c = 0;
            int size_of_side_of_sqaure = (int)Math.sqrt(l);
            String arr[][] = new String[size_of_side_of_sqaure][size_of_side_of_sqaure];
            for(int i = 0 ; i < size_of_side_of_sqaure; i++)
            {
                for(int j = 0; j < size_of_side_of_sqaure; j++)
                {                   
                    arr[i][j] = Character.toString(s.charAt(c));
                    c++;
                }
            }

            String swap0 = "";
            for(int i = 0 ; i < size_of_side_of_sqaure; i++) //reverses each column
            {
                for(int j = 0, h = size_of_side_of_sqaure-1; j < size_of_side_of_sqaure/2; h--, j++)
                {                   
                    swap0 = arr[i][j];
                    arr[i][j] = arr[i][h];
                    arr[i][h] = swap0;
                }                
            }

            String swap = "";
            for(int i = 0 ; i < size_of_side_of_sqaure; i++) //transposes the matrix
            {
                for(int j = i; j < size_of_side_of_sqaure; j++)
                {                   
                    swap = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = swap;
                }                
            }

            for(int i = 0 ; i < size_of_side_of_sqaure; i++)
            {
                for(int j = 0; j < size_of_side_of_sqaure; j++)
                {                   
                    System.out.print(arr[i][j]);                    
                }                
            }
            System.out.println();
        }
    }
}