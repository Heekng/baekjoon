package p1000;

import java.util.Scanner;

public class n8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String test = sc.next();
			int cnt = 0;
			int sum = 0;
			char arr [] = test.toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]=='O') {
					cnt++;
					sum+=cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
