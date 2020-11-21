import javax.swing.JOptionPane;
public class DemoClass {

	public static void main(String[] args) {
		Shape sobj = new Shape();
		Circle cobj = new Circle();
		Rectangle robj=new Rectangle();
		Square sqobj=new Square();
		JOptionPane.showMessageDialog(null, "FOR CIRCLE\n	INPUT VALUES");
		cobj.input();
		JOptionPane.showMessageDialog(null, "\nRADIUS\n"+cobj.getRadius());
		JOptionPane.showMessageDialog(null, "\nAREA OF CIRCLE\n"+cobj.getArea());
		JOptionPane.showMessageDialog(null, "\nPERIMETER OF CIRCLE\n"+cobj.getPerimeter());
		JOptionPane.showMessageDialog(null, "\ntoString OF CIRCLE\n"+cobj.toString());
	
		JOptionPane.showMessageDialog(null, "FOR RECTANGLE\n	INPUT VALUES");
		robj.input();
		JOptionPane.showMessageDialog(null, "\nMEASUREMENTS\nLength:"+robj.getLength() + "\nWidth:"+ robj.getWidth());
		JOptionPane.showMessageDialog(null, "\nAREA OF RECTANGLE\n"+robj.getArea());
		JOptionPane.showMessageDialog(null, "\nPERIMETER OF RECTANGLE\n"+robj.getPerimeter());
		JOptionPane.showMessageDialog(null, "\ntoString OF RECTANGLE\n"+robj.toString());

		
		JOptionPane.showMessageDialog(null, "FOR SQUARE\n");
		sqobj.setSide(10);
		JOptionPane.showMessageDialog(null, "\nLENGTH OF SIDES:"+sqobj.getSide());
		JOptionPane.showMessageDialog(null, "\nAREA OF SQUARE\n"+sqobj.getArea());
		JOptionPane.showMessageDialog(null, "\nPERIMETER OF SQUARE\n"+sqobj.getPerimeter());
		JOptionPane.showMessageDialog(null, "\ntoString OF SQUARE\n"+sqobj.toString());	
	}
}

