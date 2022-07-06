package Shape;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle()
    {
        length = 2;
        width = 1;
    }

    public Rectangle(double width, double length)
    {
        setLW(width,length);
    }

    public Rectangle(double width, double length, boolean isFilled, String color)
    {
        super(isFilled,color);
        setLW(width,length);

    }

    public void setLW(double x, double y)
    {
        if(x > y)
        {
            this.length = x;
            this.width = y;
        }

        else
        {
            this.width = y;
            this.length = x;
        }

    }

    public double getArea()
    {
        double area = this.length * this.width;
        return area;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public String toString()
    {
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }






}
