public class LineSegment
{
    private Point A;
    private Point B;
    public LineSegment(Point A, Point B)
    {
        this.A = A;
        this.B = B;
    }
    public Point getP1()
    {
       return A;
    }
    public Point getP2()
    {
       return B;
    }
    public double length()
    {
        double ydiff = B.getY() - A.getY();
        double xdiff = B.getX() - A.getX();
        
        double length = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return length;
    }
    public String toString()
    {
        return A.toString() + "-" + B.toString();
    }
    public static void main(String [] args)
    {
        Point point1 = new Point (0,3);
        Point point2 = new Point (4,0);
        
        LineSegment L1 = new LineSegment (point1,point2);
        System.out.println(L1.length());
    }
}