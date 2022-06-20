import java.lang.Math;
import java.util.Scanner;
public class PowerArr
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 20: ");
        int n = input.nextInt();

        int [] array = new int[n];



        if (n >= 1 && n <= 20)
        {

            for (int i = 0; i < array.length; i++)
            {
                array[i] = (int) Math.pow(2, i);
                System.out.println((int) array[i]);
            }

        }



        else
            {
                System.out.println("You have entered a number out of range: ");
            }





    }
}
