package B2442;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for(int i=1; i<=n; i++){
			for(int k=i; k>=0; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}
