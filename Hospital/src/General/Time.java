package General;
import javax.swing.JOptionPane;
public class Time 
{
private int hours,mins;
private String meridiem;
public Time()
{
	hours=0;
	mins=0;
	meridiem=" ";
}
public int getHours()
{
	return hours;
}
public  int getMins()
{
	return mins;
}
public  String getMeridiem()
{
	return meridiem;
}		
public void setTime(int h, int m, String mr)
{
	this.hours= h;
	this.mins=m;
	this.meridiem = mr;
}
public void input()
{
	String hour = JOptionPane.showInputDialog("Enter hours: ");
	this.hours =Integer.parseInt( hour ); 
	String min = JOptionPane.showInputDialog("Enter minute : ");
	this.mins =Integer.parseInt(min); 
	String meridm = JOptionPane.showInputDialog("Enter Am/Pm : ");
	this.meridiem =meridm; 
}
public String toString()
{
	return(hours+":"+mins+" "+meridiem);
}
}
