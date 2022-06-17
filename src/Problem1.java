
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double d;

        System.out.print("Please enter your number for a: ");
        a = input.nextDouble();

        System.out.print("Please enter your number for b: ");
        b = input.nextDouble();

        System.out.print("Please enter your number for c: ");
        c = input.nextDouble();

        System.out.print("Please enter your number for d: ");
        d = input.nextDouble();


        double total;
        double mult;
        double div;
        double sub;

        total = sum(a, b, c, d);
        mult = multiply(a, b, d);
        div = divide(b, d);
        sub = subtract(b, c);

        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + total);
        System.out.println(a + " * " + b + " * " + d + " = " + mult);
        System.out.println(b + " / " + d + " = " + div);
        System.out.println(b + " - " + c + " = " + sub);
    }

    public static double sum(double a, double b, double c, double d)
    {
        double total = (a + b + c + d);
        return total;
    }


    public static double multiply(double a, double b, double d)
    {
        double mult = (a * b * d);
        return mult;
    }

    public static double divide(double b, double d)
    {
        double div = (b / d);
        return div;
    }


    public static double subtract(double b, double c)
    {
        double sub = (b - c);
        return sub;
    }


}

