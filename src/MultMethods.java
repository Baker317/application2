
import java.util.Random;
import java.util.Scanner;

public class MultMethods
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer for n: ");

        int n = input.nextInt();
        int a = 1;
        int b = 500;


        while (n <= 0)
        {
            System.out.print("Please enter a positive integer for n: ");
            n = input.nextInt();

        }

        Random randNum = new Random();

        int[] arr = new int[n];



        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = randNum.nextInt(b) + (a);
        }

        System.out.println();

        getMax(arr);
        getMin(arr);
        sumValues(arr);
        getAverage(arr);
        greaterThanAverage(arr);
        countInc(arr);
        countDec(arr);

        printArray(arr);
        System.out.println();
        System.out.println("Maximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Number of integers greater than average: " + greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases: " + countInc(arr));
        System.out.println("Number of times subsequent value increases: " + countDec(arr));
        System.out.println("Array with 3 elements per line: ");
        printArray3PerLn(arr);


    }


    public static int getMax(int[] arr)
    {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] > max)
            {
                max = arr[i];
            }

        }

        return max;
    }


    public static int getMin(int[] arr)
    {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] < min)
            {
                min = arr[i];
            }

        }

        return min;

    }


    public static int sumValues(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

        }

        return sum;

    }


    public static double getAverage(int[] arr)
    {
        double avg = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            avg = sum / arr.length;
        }

        return avg;
    }


    public static int greaterThanAverage(int[] arr)
    {
        int sum = 0;
        int avg;
        int above = 0;


        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++)
        {
            avg = sum / arr.length;

            if (arr[i] > avg)
            {
                above += 1;
            }

        }
        return above;


    }


    public static int countInc(int[] arr)
    {
        int inc = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] < arr[i + 1])
            {
                inc += 1;
            }
        }

        return inc;


    }


    public static int countDec(int[] arr)
    {
        int dec = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                dec += 1;
            }
        }

        return dec;

    }


    public static void printArray(int[] arr)
    {
        System.out.println("Array on one line: ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }


    public static void printArray3PerLn(int[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {

            if((i + 1) % 3 == 0)
            {
                System.out.println(arr[i]);
            }
            else
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
}














