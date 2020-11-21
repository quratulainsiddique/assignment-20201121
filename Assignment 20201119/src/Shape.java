import javax.swing.JOptionPane;
public class Shape 
{
public String color;
public boolean filled;
public Shape()
{
	this.color = "green";
	this.filled = true;	
}
public Shape(String colr, boolean fild)
{
	this.color = colr;
	this.filled = fild;
}
protected String getColor()
{
	return this.color;
}
protected void setColor(String colour)
{
	this.color = colour;
}
protected  boolean isFilled()
{
	return this.filled;
}
protected void setFilled(boolean filld)
{
	this.filled = filld;
}
public String toString()
{
	String temp = null;
	if (filled == true)
	{
	  temp=  "A Shape with color of " + color+ " and filled";
	}
	else if (filled == false)
	{
	temp =  "A Shape with color of " + color+ " and not filled";
	}
	return temp;
}
void input()
{
		this.color = JOptionPane.showInputDialog("Enter color name: ");
		String filled1 = JOptionPane.showInputDialog("Enter filling : ");
		this.filled =Boolean.parseBoolean(filled1); 
}
}//end of class