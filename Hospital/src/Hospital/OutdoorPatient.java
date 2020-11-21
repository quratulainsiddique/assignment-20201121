package Hospital;
import General.Date;
import General.Time;
import javax.swing.JOptionPane;
public class OutdoorPatient extends Patient 
{
	private Date appointmentDate;
	private Time appointmentTime;
	private Doctor dc;
	private int fee;
	private Patient pt;
	public OutdoorPatient()
	{
	fee =0;
	dc = new Doctor();
	appointmentDate= new Date();
	appointmentTime = new Time();
	}
	public int getFee()
	{
		return fee;
	}
	public String getDoctor()
	{
		return dc.toString();
	}
	public String getAppointmentDate()
	{
		return appointmentDate.toString();
	}
	public String getAppointmentTime()
	{
		return appointmentTime.toString();
	}
	public void input()
	{
		pt.input();
		String Fee = JOptionPane.showInputDialog("Enter doctor fee : ");
		fee =Integer.parseInt(Fee); 
		dc.input();
		appointmentDate.input();
		appointmentTime.input();
	}
	public String toString()
	{
		return(super.toString()+"\nFee: "+fee+
				"\n Date of appointment: "+appointmentDate.toString()+"\nTime of appointment: "+appointmentTime.toString()
				+"\n"+dc.toString());
	}
	public void update()
	{
		appointmentDate.input();
		appointmentTime.input();
	}
}//end class