package p1000;

import java.util.Scanner;

public class n8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
