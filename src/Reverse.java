public class Reverse
{
    public static void main(String[] args)
    {

        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));

    }

    public static boolean isExactReverse(String x, String y)
    {
        String strY = "";

        for (int i = y.length() - 1; i >= 0; i--)
        {
            strY += y.charAt(i);

        }


        if (strY.equals(x))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


















