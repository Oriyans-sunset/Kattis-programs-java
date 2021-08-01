import java.util.*;
class Quadrant_Selection
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if( -1000 <= x && x <= -1 && y >= -1000 && y <= -1)
            System.out.println(3);
        if( 1 <= x && x <= 1000 && 1 <= y && y <= 1000)
            System.out.println(1);
        if( 1 <= x && x <= 1000 && y >= -1000 && y <= -1)
            System.out.println(4);
        if( -1000 <= x && x <= -1 && y >= 1 && y <= 1000)
            System.out.println(2);
    }
}