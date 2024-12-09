package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class NumSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n =scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(a);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		double avg = (double) sum / n;
		
		System.out.println("Sorted array is: " + Arrays.toString(a));
		System.out.println("Array sum is: " + sum);
		System.out.println("The average of the array is: " + avg);
		System.exit(0);
	}
}
