import java.util.Scanner;
public class Time
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int weeks;
        int days;
        int hours;
        int min;
        int sec;

        System.out.print("Please enter number of weeks: ");
        weeks = input.nextInt();

        days = (weeks * 7);
        hours = (days * 24);
        min = (hours * 60);
        sec = (min * 60);

        System.out.println(days + " days.");
        System.out.println(hours + " hours.");
        System.out.println(min + " minutes.");
        System.out.println(sec + " seconds.");

    }
}
