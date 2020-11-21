import javax.swing.JOptionPane;
public class Rectangle extends Shape 
{
	protected double width, length;
	public Rectangle()
	{
		this.width = this.length = 1.0;
	}
	public Rectangle(double wid, double len)
	{
		this.width= wid;
		this.length = len;	
	}
	public Rectangle(double wid, double len, String col, boolean fil)
	{
		this.width= wid;
		this.length = len;
		super.color = col;
		super.filled = fil;
	}
	protected double getWidth()
	{
		return width;
	}
	protected void setWidth(double wid)
	{
		this.width = wid;
	}
	protected double getLength()
	{
		return length;
	}
	protected void setLength(double len)
	{
		this.length = len;
	}
	protected double getArea()
	{
		return (width * length);
	}
	protected double getPerimeter()
	{
		return (2*(length + width));
	}
	public String toString()
	{
		return ("A Rectangle with width="+ width+ " and length="+ length+ ", which is a subclass of "+ super.toString());
	}
	void input()
{
	String twidth = JOptionPane.showInputDialog("Enter width: ");
	this.width =Integer.parseInt(twidth); 
	String tlength = JOptionPane.showInputDialog("Enter length : ");
	this.length =Integer.parseInt(tlength);
}
}//end class

