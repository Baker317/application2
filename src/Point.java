public class Point
{

    //instance variables
    private int x;
    private int y;

    public static int numberOfPoints = 0;


    public Point()  //no parameters
    {
        this.x = 0;
        this.y = 0;
        numberOfPoints++;
    }


    public Point(int xVal, int yVal)
    {
        this.x = xVal;
        this.y = yVal;
        numberOfPoints++;

    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }


    public void setPoint(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
        numberOfPoints++;
    }

    public String toString()
    {
        return "( " + this.x + " , " + this.y + " )";
    }

    public double distance(Point pnt)
    {
        int x = pnt.x;
        int y = pnt.y;

        double distance = Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y), 2));

        return distance;


    }

    public boolean theyAreEqual(Point pnt)
    {
        if(this.x == pnt.x && this.y  == pnt.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }





}
