import java.awt.Graphics;
import java.awt.Point;

public class Graph {
	private Point[] points;
	private double startPoint;
	private double horizontal;
	private double vertical;
	
	public Graph(){
		points = new Point[10];
		startPoint = 0;
		horizontal = 0;
		vertical = 0;
	}
	
	public Graph(double startPoint, double horizontal, double vertical){
		for(int i = 0; i < 10; i++){
			double x, y;
			x = i;
			y = Math.pow(startPoint,i-horizontal) + vertical;
			Point z = new Point();
			z.setLocation(x,y);
			points[i] = z;
		}
	}
	
	public void paint(Graphics g){
//      (  x,  y,  w,  h);
		g.drawLine(  0,200,400,200);
		g.drawLine(200,  0,200,400);
		
		for(int i = 0; i < 10; i++)
			g.drawOval( i*25 , i*25 , 400 - (i*50) , 400 - (i*50) );
	}
	
	public static void main(String[] args){
		Graph x = new Graph();
	}
}
