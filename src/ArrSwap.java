//import for rand num
import java.util.Random;
import java.util.Scanner;
public class ArrSwap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number greater than 10: ");

        int n = input.nextInt();

        int a = 2; //min allowed
        int b = 75; // max allowed
        int total; // for sum
        int first; // array swap 1
        int second; // second swap




        while(n <= 10)
        {
            System.out.print("Please enter a number greater than 10: ");
            n = input.nextInt();

        }

        int[] array = new int[n];



    // random number creation
        Random randNum = new Random();

        System.out.println();

        System.out.println("Before swap: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = randNum.nextInt(b) + (a);
            System.out.print(array[i] + " ");


        }

        System.out.println();

        total = array[2] + array[5] + array[7] + array[9];
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + total);

        first = array[2];
        array[2] = array[6];
        array[6] = first;

        second = array[4];
        array[4] = array[7];
        array[7] = second;

        System.out.println();


        System.out.println("After swap: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        total = array[2] + array[5] + array[7] + array[9];
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + total);



        System.out.println();

        }

    }

