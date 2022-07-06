package Shape;

import Shape.Shape;

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
