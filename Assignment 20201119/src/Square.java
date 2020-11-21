
public final class Square extends Rectangle {
	public
		Square()
{
	super.length=1.0;
	super.width=1.0;
}
public Square (double side)
{
	super.width= side;
	super.length = side;
}
public Square(double side, String Color,boolean Filed)
{
	super.width=super.length=side;
	super.color = Color;
	super.filled = Filed;
}
protected double getSide()
{
	return super.length;
}
protected void setSide(double side)
{
	super.length=side;
	super.width=side;
}
protected void setWidth(double side)
{
	//in square both are same so if one side is updated other will also be pdated.
	super.width=super.length=side;
}
protected void setLength(double side)
{
	//in square both are same so if one side is updated other will also be pdated.
	super.width=super.length=side;
}
public String toString()
{
	return ("A Square with side="+super.length+", which is a subclass of "+super.toString());
}
protected double getArea()
{
	return super.getArea();
}
protected double getPerimeter()
{
	return super.getPerimeter();
}
}//end class