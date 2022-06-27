
import java.util.Scanner;
public class nestedShapes
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer for n: ");
        int n = input.nextInt();



        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j >= 1; j--)
            {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print(" *");

                else if (i == j)
                {
                    System.out.print(" +");
                }

                else
                    System.out.print("  ");

            }
            System.out.println();

        }

    }

}


