package Hospital;
import General.Date;
import javax.swing.JOptionPane;
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctr[] = new Doctor[3];
		Doctor searc =new Doctor();
		int found =0;
		Date dt = new Date();
		IndoorPatient ipatint[] = new IndoorPatient[3];
		OutdoorPatient opatint[] =new OutdoorPatient[3];
		int iPatent=-1,oPatent=-1;
		for(int a=0;a<3;a++)
		{
			doctr[a] = new Doctor();
			doctr[a].input();
		}
		String choice ="yes";
		int ch=0;
		do
		{
			choice = JOptionPane.showInputDialog("\nMENU\n1- Add an indoor patient\n"
					+ "2- Add an outdoor patient\n"
					+ "3- See the list of all Doctors\n"
					+ "4- Search a doctor by name or department\n"
					+ "5- See the list of all indoor patients\n"
					+ "6- See the list of all appointments on a certain day\n"
					+ "7- See the list of appointments of a certain doctor\n"
					+ "8- Change the date or time of appointment of a certain patient.\n9.exit\nEnter your choice: ");
			ch =Integer.parseInt(choice); 
			
			switch(ch)
			{
			case 1:
				iPatent++;
				ipatint[iPatent]=new IndoorPatient();
				ipatint[iPatent].input();
			break;
			case 2:	oPatent++;
			opatint[iPatent]=new OutdoorPatient();
			opatint[iPatent].input();
			break;
			case 3:
				for(int b=0;b<3;b++)
					{
					JOptionPane.showMessageDialog(null, doctr[b].toString()+"\n");
					}
			break;
			case 4:
				found =0;
				String searchby = JOptionPane.showInputDialog("Do you want to search by:\n1.name\n2.department\nEnter your choice: " );
				ch =Integer.parseInt(searchby); 
				if(ch ==1)
				{
					String searh = JOptionPane.showInputDialog("Enter parameter: " );
					for(int b=0;b<3;b++)
					{
						if(doctr[b].getName()==searh )
						{
							found = 1;
						}
					}
				}
				else if(ch ==2)
				{
					String searh = JOptionPane.showInputDialog("Enter parameter: " );
					for(int b=0;b<3;b++)
					{
						if(doctr[b].getDepartment()==searh )
						{
							found = 1;
						}
					}
				}
				
			if(found == 0)
			{
				JOptionPane.showMessageDialog(null, "\nNOT FOUND\n");
			}
			else if(found ==1)
			{
				JOptionPane.showMessageDialog(null, "\nFOUND\n");
			}
			
			break;
			case 5:
				for(int b=0;b<=iPatent;b++)
				{
				JOptionPane.showMessageDialog(null, ipatint[b].toString()+"\n");
				}
			break;
			case 6:
				found =0;
				dt.input();
				for(int b=0;b<oPatent;b++)
				{
					if(dt.toString()==opatint[b].getAppointmentDate() )
					{
						found = 1;
					}
				}
				if(found == 0)
				{
					JOptionPane.showMessageDialog(null, "\nNOT FOUND\n");
				}
				else if(found ==1)
				{
					JOptionPane.showMessageDialog(null, "\nFOUND\n");
				}
			break;
			case 7:
				found =0;
				searc.input();
				for(int b=0;b<oPatent;b++)
				{
					if(searc.toString()==opatint[b].getDoctor())
					{
						found = 1;
					}
				}
				if(found == 0)
				{
					JOptionPane.showMessageDialog(null, "\nNOT FOUND\n");
				}
				else if(found ==1)
				{
					JOptionPane.showMessageDialog(null, "\nFOUND\n");
				}
			break;
			case 8:
				found =0;
				String pname = JOptionPane.showInputDialog("\nEnter name of patient: " );
				for(int b=0;b<iPatent && found ==0;b++)
				{
					if(ipatint[b].getName()==pname )
					{
						found = 1;
						ipatint[b].update();
					}
				}
				//if patient is not from indoor patients
				if(found == 0)
				{
					for(int b=0;b<oPatent && found ==0;b++)
					{	
						if(opatint[b].getName()==pname )
						{
							found = 1;
							opatint[b].update();
						}
					}
				}
			if(found == 0)
			{
				JOptionPane.showMessageDialog(null, "\nNOT FOUND\n");
			}
			break;
			}
		}while(ch != 9);
	}
}
