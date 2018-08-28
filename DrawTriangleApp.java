import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
 
public class DrawTriangleApp extends JPanel {
    Triangle triangle;
    
    public DrawTriangleApp(Triangle t) {
    setBackground(Color.lightGray);
    triangle = t;
  }
    public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setPaint(Color.red);
    g2d.draw(new Line2D.Double(triangle.getLineSegmentP1P2().getP1().getX(),triangle.getLineSegmentP1P2().getP1().getY(),
                                triangle.getLineSegmentP1P2().getP2().getX(),triangle.getLineSegmentP1P2().getP2().getY() ));
  g2d.draw(new Line2D.Double(triangle.getLineSegmentP2P3().getP1().getX(),triangle.getLineSegmentP2P3().getP1().getY(),
                                triangle.getLineSegmentP2P3().getP2().getX(),triangle.getLineSegmentP2P3().getP2().getY() ));
  g2d.draw(new Line2D.Double(triangle.getLineSegmentP3P1().getP1().getX(),triangle.getLineSegmentP3P1().getP1().getY(),
                                triangle.getLineSegmentP3P1().getP2().getX(),triangle.getLineSegmentP3P1().getP2().getY() ));
    }
    public static void main(String s[]) {
    JFrame frame = new JFrame("Show Triangle");
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,200);
    Point p3 = new Point(150,0);
    //////////////////
    Triangle t = new Triangle(p1,p2,p3);//This line of code will have to be edited 
    //////////////////
    System.out.println("Triangle" + t);
    System.out.println("Line Segment P1P2: " + t.getLineSegmentP1P2());
    System.out.println("Line Segment P2P3: " + t.getLineSegmentP2P3());
    System.out.println("Line Segment P3P1: " + t.getLineSegmentP3P1());
    System.out.println("Area: " + t.area());
    System.out.println("Perimeter: " + t.perimeter());
    JPanel panel = new DrawTriangleApp(t);
    frame.getContentPane().add("Center", panel);
    frame.setSize(300, 250);
    frame.setVisible(true);
  }
}