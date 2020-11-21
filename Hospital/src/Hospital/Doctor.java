package Hospital;
import javax.swing.JOptionPane;
public class Doctor
{
private	 String name,department,specialization;
private char gender;
private int cnic,phone_no;
public Doctor()
{
	name=" ";
	cnic=0;
	phone_no=0;
	gender='X';
	department=" ";
	specialization=" ";
}
public String getName()
{
	return name;
}
public void setDoctorDetails(String nm,String de,int cn,int ph,char gn,String sp)
{
	this.name=nm;
	this.department=de;
	this.cnic=cn;
	this.phone_no=ph;
	this.gender=gn;
	this.specialization=sp;
}
public String getDepartment()
{
	return department;
}
public int getCnic()
{
	return cnic;
}
public int getPhoneNo()
{
	return phone_no;
}
public char getGender()
{
	return gender;
}
public String getSpecialization()
{
	return specialization;
}
void input()
{
	this.name= JOptionPane.showInputDialog("INPUT DOCTOR DETAILS\nEnter doctor name: ");
	String phone = JOptionPane.showInputDialog("Enter doctor phone no : ");
	this.phone_no =Integer.parseInt(phone); 
	String cni = JOptionPane.showInputDialog("Enter doctor cnic : ");
	this.cnic =Integer.parseInt(cni); 
	String gend = JOptionPane.showInputDialog("Enter doctor gender: ");
	this.gender =gend.charAt(0);
	this.department = JOptionPane.showInputDialog("Enter doctor department: ");
	this.specialization = JOptionPane.showInputDialog("Enter doctor specialization: ");
}
public String toString()
{
	return("Doctor Details:\nName: "+name+"\nGender: "+gender+
			"\nCNIC: "+cnic+"\nPhone Number: "+phone_no+
			"\nDdepartment: "+department+"\nSpecialization: "+specialization);
}
}//end class
