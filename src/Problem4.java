import java.util.Scanner;
public class Problem4
{
    public static void main(String[] args)
    {
        // input for scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer for n: ");
        int n = input.nextInt();

        int sum;

        // for loop for finding the last number in each input(ex: it finds 1 then 4 then 3 and adds them together
        // mod 10 allows us to separate before adding( 341 % 10 = 1/ 34 % 10 = 4/ 3 % 10 = 3
        for (sum = 0; n > 0; n = n / 10)
        {
            sum += n % 10;

        }

        System.out.println("The sum of all digits entered is: " + sum);



    }
}
