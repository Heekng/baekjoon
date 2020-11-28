package p1000;

import java.util.Scanner;

public class n4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int arr[] = new int[num];
			double sum=0.0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum+=arr[j];
			}
			double avg = sum/arr.length;
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f", 100.0*cnt/arr.length);
			System.out.println("%");
		}
	}
}
