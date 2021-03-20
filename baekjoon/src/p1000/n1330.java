package p1000;

import java.util.Scanner;

public class n1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short x = sc.nextShort();
		short y = sc.nextShort();
		if(x > y) System.out.println(">");
		else if(x == y) System.out.println("==");
		else System.out.println("<");
	}
}
