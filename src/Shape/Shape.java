package Shape;

public class Shape {
    private boolean isFilled;

    private String color;


    public Shape() {
        isFilled = true;
        color = "green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean getIsFilled() {
        return this.isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "Filled: " + getIsFilled() + "\n" + "Color: " + getColor();
    }

}







