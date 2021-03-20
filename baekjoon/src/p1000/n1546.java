package p1000;

import java.util.Scanner;

public class n1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0, maxIndex=0;
		int arr[] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		double sum=0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += 1.0*arr[i]/max*100;
		}
		System.out.println(sum/n);
	}
}
