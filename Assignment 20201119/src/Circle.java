import javax.swing.JOptionPane;
public final class Circle extends Shape{
private double radius;
final double pie = 3.14;
 public Circle()
{
	super();
	this.radius=1.0;
}
public Circle (double rad)
{
	super();
	this.radius=rad;
}
public Circle (double radi, String col, boolean fil)
{
	this.radius = radi;
	super.color = col;
	super.filled = fil;
}
protected double getRadius()
{
	return radius;
}
protected void setRadius(double rad)
{
	radius = rad;
}
protected double getArea()
{
	return (pie * radius * radius);
}
protected double getPerimeter()
{
	return (2 * pie *radius);
}
public String toString()
{
	return "A Circle with radius = "+ this.radius+ ", which is a subclass of "+ super.toString();
}
public void input()
{
	String temp = JOptionPane.showInputDialog("Enter radius: ");
	this.radius =Float.parseFloat(temp); 
	super.input();
}
}//end of class
