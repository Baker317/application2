import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");

        int n = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++ )
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println("The sum of all even number between 1 and " + n + " is: " + sum);

    }
}
