package General;
import javax.swing.JOptionPane;
public class Date
{
private int day,month,year;
public Date()
{
	day=0;
	month=0;
	year=0;
}
public int getDay()
{
	return day;
}
public  int getMonth()
{
	return month;
}
public  int getYear()
{
	return year;
}		
public void setDate(int dy, int mh, int yr)
{
	this.day = dy;
	this.month = mh;
	this.year = yr;
}
public void input()
{
	String day1 = JOptionPane.showInputDialog("Enter today  date: ");
	this.day=Integer.parseInt( day1 ); 
	String month1 = JOptionPane.showInputDialog("Enter month : ");
	this.month =Integer.parseInt(month1); 
	String year1 = JOptionPane.showInputDialog("Enter year : ");
	this.year =Integer.parseInt(year1); 
}
public String toString()
{
	return (day+"/"+month+"/"+year);
}
}//end