public class Triangle
{
    private LineSegment segP1P2;
    private LineSegment segP2P3;
    private LineSegment segP3P1;
    private double S;
    private double A;
    public Triangle(Point p1, Point p2, Point p3)
    {
        segP1P2 = new LineSegment(p1,p2);
        segP2P3 = new LineSegment(p2,p3);
        segP3P1 = new LineSegment(p3,p1);
    }
    public LineSegment getLineSegmentP1P2()
    {
        return segP1P2;
    }
    public LineSegment getLineSegmentP2P3()
    {
        return segP2P3;
    }
    public LineSegment getLineSegmentP3P1()
    {
        return segP3P1;
    }
    public String toString()
    {
        return segP1P2.toString() + "-" + segP2P3.toString() + "-" + segP3P1.toString(); 
    }
    public double perimeter()
    {
        return segP1P2.length() + segP2P3.length() + segP3P1.length();
    }
    public double area()
    {
        S = (segP1P2.length() + segP2P3.length() + segP3P1.length())/(2);
        A = Math.sqrt(S*(S - segP1P2.length())*(S - segP2P3.length())*(S - segP3P1.length()));
        return A;
    }
}
