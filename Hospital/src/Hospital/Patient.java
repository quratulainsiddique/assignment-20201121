package Hospital;
import javax.swing.JOptionPane;
public class Patient {
	private	 String name,address;
	private char gender;
	private int cnic,phone_no,age;
	public Patient()
	{
		name=" ";
		cnic=0;
		phone_no=0;
		gender='X';
		address= " ";
		age =0;
	}
	public String getName()
	{
		return name;
	}
	public void setDoctorDetails(String nm,String ad,int cn,int ph,char gn,int ag)
	{
		this.name=nm;
		this.address=ad;
		this.cnic=cn;
		this.phone_no=ph;
		this.gender=gn;
		this.age=ag;
	}
	public String getAddress()
	{
		return address;
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
	public int getAge()
	{
		return age;
	}
	void input()
	{
		this.name= JOptionPane.showInputDialog("INPUT PATIENT DETAILS\nEnter patient name: ");
		String phone = JOptionPane.showInputDialog("Enter patient phone no : ");
		this.phone_no =Integer.parseInt(phone); 
		String cni = JOptionPane.showInputDialog("Enter patient cnic : ");
		this.cnic =Integer.parseInt(cni); 
		String gend = JOptionPane.showInputDialog("Enter patient gender: ");
		this.gender =gend.charAt(0);
		this.address = JOptionPane.showInputDialog("Enter patient address: ");
		String agee = JOptionPane.showInputDialog("Enterpatient age: ");
		this.age =Integer.parseInt(agee); 
	}
	public String toString()
	{
		return("Patient Details:\nName: "+name+"\nGender: "+gender+
				"\nCNIC: "+cnic+"Phone Number: "+phone_no+
				"\nAddress: "+address+"\nAge: "+age);
	}
}

