public class ArrShift
{
    public static void main(String[] args)
    {
        int[] array = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};

        System.out.println("Before shifting: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }


        System.out.println();
        System.out.println();


        //I = 1 to move everything over 1 to the left
        // call array[0] to put first number on end

        System.out.println("After shifting: ");

        for (int i = 1; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.print(array[0]);

        System.out.println();


    }
}
