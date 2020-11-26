package p1000;

import java.util.Scanner;

public class n2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = y/100;
		int b = y/10 - a*10;
		int c = y%10;
		System.out.println(x*c);
		System.out.println(x*b);
		System.out.println(x*a);
		System.out.println(x*y);
	}
}
