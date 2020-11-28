package p1000;

import java.util.Scanner;

public class n1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int cnt = 0;
		while(true) {
			cnt++;
			int k = n/10 + n%10;
			n = (n%10)*10 + k%10;
			if(n == num) break;
		}
		System.out.println(cnt);
	}
}