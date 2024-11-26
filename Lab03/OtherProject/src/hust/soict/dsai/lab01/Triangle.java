package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the height of the triangle: ");
		int n = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i-1); j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
