
//User Inputs 3 numbers/Displays if numbers are increasing,decreasing, or neither
//Created by: Kyran and Anthony


import java.util.Scanner;
public class Conditional
{
    public static void main(String[] args)
    {

        // Creates new scanner and allows user to input three numbers for x,y,and z
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your first number for x: ");
        double x = input.nextDouble();

        System.out.print("Please enter your second number for y: ");
        double y = input.nextDouble();

        System.out.print("Please enter your third number for z: ");
        double z = input.nextDouble();

        // if statement to discover increasing, decreasing, or neither

        if (x < y && y < z)
        {
            System.out.println("Increasing");
        }
        else if (x > y && y > z)
         {
            System.out.println("Decreasing");
         }

        else
        {
            System.out.println("Neither");
        }
    }
}

