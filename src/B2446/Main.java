package B2446;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for (int j=2*n-2*i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n-1; i>=1; i--) {
			for (int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for (int j=2*n-2*i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
