package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class SolvingEquation {
	public static void main(String[] args) {
		String n;
		n = JOptionPane.showInputDialog(null, "Choose the type of the equations:"
				+ "\n1. 1st-degree equation with 1 variable.\n2. The system of 1st-degree equations with 2 variables."
				+ "\n3. 2st-degree equation with 1 variable.");
		double t = Double.parseDouble(n);
		if (t == 1) {
			String a, b;
			a = JOptionPane.showInputDialog(null, "Input a");
			b = JOptionPane.showInputDialog(null, "Input b");
			double x, y;
			x = Double.parseDouble(a);
			y = Double.parseDouble(b);
			if (x == 0)
				JOptionPane.showMessageDialog(null, "Infinite many solutions.");
			else {
				double sol = (-y)/x;
				JOptionPane.showMessageDialog(null, "x = " + sol);
			}
		} else if (t == 2) {
			String x11, x12, x21, x22, y1, y2;
			x11 = JOptionPane.showInputDialog(null, "Input a11");
			x12 = JOptionPane.showInputDialog(null, "Input a12");
			y1 = JOptionPane.showInputDialog(null, "Input b1");
			x21 = JOptionPane.showInputDialog(null, "Input a21");
			x22 = JOptionPane.showInputDialog(null, "Input a22");
			y2 = JOptionPane.showInputDialog(null, "Input b2");
			
			double a11, a12, a21, a22, b1, b2;
			a11 = Double.parseDouble(x11);
			a12 = Double.parseDouble(x12);
			a21 = Double.parseDouble(x21);
			a22 = Double.parseDouble(x22);
			b1 = Double.parseDouble(y1);
			b2 = Double.parseDouble(y2);
			double D1 = b1*a22 - b2*a12;
            double D2 = b2*a11 - b1*a21;
            double D = a11*a22 - a21*a12;
            
            if (D1 == 0 && D2 == 0 && D == 0) {
            	JOptionPane.showMessageDialog(null, "Infinite many solutions.");
            } else if (D1 != 0 && D2 != 0 && D == 0) {
            	JOptionPane.showMessageDialog(null, "No solutions");
            } else {
                double x1 = D1/D;
                double x2 = D2/D;
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
            }            
		} else {
			String x, y, z;
			x = JOptionPane.showInputDialog(null, "Input a");
			y = JOptionPane.showInputDialog(null, "Input b");
			z = JOptionPane.showInputDialog(null, "Input c");
			
			double a = Double.parseDouble(x);
			double b = Double.parseDouble(y);
			double c = Double.parseDouble(z);
			double delta = b*b - 4*a*c;
			
            if (a == 0) {
                double sol = (-c)/b;
                JOptionPane.showMessageDialog(null, "x = " + sol);
            } else if (delta < 0) {
            	JOptionPane.showMessageDialog(null, "No solution.");
            } else if (delta == 0) {
                double sol = (-b)/(2*a);
                JOptionPane.showMessageDialog(null, "x = " + sol);
            } else {
                double sol1 = ((-b) + Math.sqrt(delta))/(2*a);
                double sol2 = ((-b) - Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "x1 = " + sol1 + "\nx2 = " + sol2);
            }
		}
		System.exit(0);
	}
}
