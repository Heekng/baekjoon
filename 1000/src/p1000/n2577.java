package p1000;

import java.util.Scanner;

public class n2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		String numS = ""+num;
		int arr[] = new int [10];
		for (int i = 0; i < numS.length(); i++) {
			int a = num%10;
			arr[a]++;
			num/=10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
