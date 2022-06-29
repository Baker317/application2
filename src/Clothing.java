public class Clothing
{
    public double price;
    public String type;

    public String size;




public Clothing()
{
    price = 29.9;
    type = "Tshirt";
    size = "Medium";

}

public Clothing(double p, String t, String s)
{
    price = p;
    type = t;
    size = s;


}

public void increasePrice()
{
    price += 5;
}

public void increasePrice(double x)
{
    price += x;
}

public void details()
{
    System.out.println("Item: " + type);
    System.out.println("Size: " + size);
    System.out.println("Price: " + price);
}






}
