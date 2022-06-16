import java.util.Scanner;
public class Factor
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number greater than 1: ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        if (n <= 1)
        {
            System.out.println("You entered a number 1 or below: ");
        }
        else if (n > 1)
        {

            while (count < n)
            {
                count++;

                if (n % count == 0)
                {
                    sum += count;
                }

            }
            System.out.println("The sum of all factors of " + n + " is " + sum);
        }
    }
}







