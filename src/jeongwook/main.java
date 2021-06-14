package jeongwook;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		System.out.println(a1 == a2 ? "==" : (a1 > a2 ? ">" : "<"));
	}
}
