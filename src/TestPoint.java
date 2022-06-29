
    public class TestPoint
    {
        public static void main(String[] args)
        {

            System.out.println("numberofpoints: " + Point.numberOfPoints);


            Point p1 = new Point(0, 0);
            System.out.println("numberofpoints: " + p1.numberOfPoints);

            Point p2 = new Point(3, 4);
            System.out.println("numberofpoints: " + p2.numberOfPoints);

            Point p3 = new Point();
            System.out.println("numberofpoints: " + p3.numberOfPoints);

            System.out.println("They are equal:" + p1.theyAreEqual(p3));


            System.out.print("The distance from " + p1.toString() + " to " + p2.toString() + " is: ");
            System.out.println(p1.distance(p2));
            System.out.println();


            p1.setPoint(1, 4);
            System.out.println("P1 new coordinates are:");
            System.out.println("x = " + p1.getX());
            System.out.println("y = " + p1.getY());

            p2.setPoint(2, 3);
            System.out.println("P2 new coordinates are:");
            System.out.println("x = " + p2.getX());
            System.out.println("y = " + p2.getY());
            System.out.println();

            System.out.print("The distance from " + p1.toString() + " to " + p2.toString() + " is: ");
            System.out.println(p1.distance(p2));

        }


    }

