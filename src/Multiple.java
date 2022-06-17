import java.util.Scanner;
public class Multiple
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter integer for x:  ");
        int x = input.nextInt();


        for(int i = 1; i <= x; i++)
        {
            if(i % 3 == 0 && i % 2 != 0)
            {
                System.out.println(i + " is a multiple of 3.");
            }

        }
    }
}
