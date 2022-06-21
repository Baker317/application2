
import java.util.Scanner;
public class MMA
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer for n: ");


        int n = input.nextInt();


        // while loop to continue asking until correct input
        while (n <= 0)
        {
            System.out.print("Please enter a positive integer for n: ");
            n = input.nextInt();
        }


        System.out.print("Enter " + n + " integers: ");



        // creation of array
        int[] array = new int[n];




        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();

        }

        System.out.println();


        System.out.print("You entered: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();





        //Initializing max,min,total,avg
        int max = array[0];
        int min = array[0];
        double total = 0;
        double avg = 0;


        //for loop to discover max, min, total, avg

        for (int i = 0; i < array.length; i++)
        {

            if (array[i] > max)
            {
                max = array[i];
            }
            if (array[i] < min)
            {
                min = array[i];
            }

            total += array[i];
            avg = total / array.length;

        }


        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average: " + avg);

        System.out.println();


        System.out.println("Elements greater than average: ");

        //for loop for elements greater than average

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > avg)
            {
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();


        System.out.println("Elements greater than " + array[n-1] + ": ");

        // for loop for greater than last number in array
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > array[n-1])
            {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        //reverse order array
        System.out.println("Array in reverse order: ");

        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();




    }
}



















