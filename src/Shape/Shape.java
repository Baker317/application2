package Shape;

public class Shape
{
    private boolean isFilled;

    private String color;


    public Shape()
    {
        isFilled = true;
        color = "green";
    }

    public Shape(boolean isFilled, String color)
    {
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean getIsFilled()
    {
        return this.isFilled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setIsFilled(boolean isFilled)
    {
        this.isFilled = isFilled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    public String toString()
    {
        return "Filled: " + getIsFilled() + "\n" + "Color: " + getColor();
    }

    public class Circle extends Shape
    {
        private double radius;

    public Circle()
    {
        radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color)
    {
        super(isFilled,color);
        this.radius = radius;

    }

    public double getArea()
    {
       double area = Math.PI * Math.pow(this.radius, 2);
       return area;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + getRadius() + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }







    }


    public class Rectangle extends Shape
    {

    }







}
