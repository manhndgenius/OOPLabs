package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class Calculating {
	public static void main(String[] args) {
		String a, b;
		a = JOptionPane.showInputDialog(null, 
				"Please input the first number:", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		b = JOptionPane.showInputDialog(null, 
				"Please input the second number:", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double sum, dif, pro, quo;
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);
		sum = num1 + num2;
		dif = num1 - num2;
		pro = num1 * num2;
		if (num2 == 0)
			JOptionPane.showMessageDialog(null, "Cannot calculate the division with zero.");
		else {
			quo = num1 / num2;
			JOptionPane.showMessageDialog(null, "The sum is: " + sum + ".\nThe difference is: " + dif
					+ ".\nThe product is: " + pro + ".\nThe quotation is: " + quo + ".");
		}
		System.exit(0);
	}
}
