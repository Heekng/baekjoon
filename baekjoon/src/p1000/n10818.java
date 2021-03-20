package p1000;

import java.util.Scanner;

public class n10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0, min = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(i==0) {
				max = num;
				min = num;
			}
			if(num > max) max = num;
			if(num < min) min = num;
		}
		System.out.println(min+" "+max);
	}
}
