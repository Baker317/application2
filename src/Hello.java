/* public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!!!");

        //multiplies the two numbers and prints to screen
        int number1 = 5;
        int number2 = 20;


        System.out.println(number1 * number2);



        /* short number3 = 4;
        byte number4 = 7;
        float number5 = 5.69F;
        double number2 = 4.25;
        boolean isTrue = true;
        char x = 'x';
        String greet = "Hello";


    */

public class Hello
{
    public static double methodA(double a, double b)
    {
        a *= 2;
        b += 0;
        return 3 * a + b / 2;
    }
    public static int methodB(int a, int b)
    {
        int r;
        System.out.println("Method practice! ");
        if (a < 4)
        {
            r = 1;
            System.out.println("methodc is still useful");
        }
        else if (a % 2 == 0)
            r = 30;
        else
            r = 3 * a;

        return r;
    }
    public static void methodC()
    {
        System.out.println("I return nothing :) ");
    }

    public static void main(String[] args)
    {
        int x = 5;
        double z = 7;

        System.out.print("METHODS ");
        System.out.println(methodB(x, (int) z));
        System.out.println(methodA(3, 9));
        methodC();
        System.out.println(methodA(x, z));
        System.out.println(methodB(2, 4));
    }

}







