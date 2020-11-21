package Hospital;

import General.Date;
import javax.swing.JOptionPane;
public class IndoorPatient extends Patient{
private int wardno,roomno,bedno, fee;
private Doctor doc;
private Date admision;
private Patient pt;
public IndoorPatient()
{
wardno= roomno= bedno= fee =0;
doc = new Doctor();
admision= new Date();
pt = new Patient();
}
public int getWardno()
{
	return wardno;
}
public int getRoomno()
{
	return roomno;
}
public int getBedno()
{
	return bedno;
}
public int getFee()
{
	return fee;
}
public String getDoctor()
{
	return doc.toString();
}
public String getDate()
{
	return admision.toString();
}
public void input()
{
	pt.input();
	String wardNo = JOptionPane.showInputDialog("Enter ward no : ");
	wardno =Integer.parseInt(wardNo); 
	String roomNo = JOptionPane.showInputDialog("Enter room no : ");
	roomno =Integer.parseInt(roomNo); 
	String bedNo = JOptionPane.showInputDialog("Enter bed no : ");
	bedno =Integer.parseInt(bedNo);
	String Fee = JOptionPane.showInputDialog("Enter doctor fee : ");
	fee =Integer.parseInt(Fee); 
	doc.input();
	admision.input();
}
public String toString()
{
	return(super.toString()+"\nward No: "+wardno+"\nProom No: "
+roomno+"\nbed No: "+bedno+"\nfee: "+fee+"\n Date of admission: "+admision.toString()+"\n"+doc.toString());
}
public void update()
{
	admision.input();
}
}//end of class
