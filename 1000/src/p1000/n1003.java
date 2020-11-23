package p1000;

import java.util.Scanner;

public class n1003 {
	static int arr [] = new int [41];
	static int fibonacci (int n) {
		if(arr[n] > 0) {
			return arr[n];
		}
		if(n==0) return 0;
		if(n == 1 || n==2) return 1;
		return arr[n] = fibonacci(n-2)+fibonacci(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			if(n==0) System.out.println("1 0");
			else System.out.println(fibonacci(n-1)+" "+fibonacci(n));
		}
	}
}
