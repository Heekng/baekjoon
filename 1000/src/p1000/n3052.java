package p1000;

import java.util.Scanner;

public class n3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [42];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			int b = a%42;
			if(arr[b] == 0) arr[b] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			cnt+=arr[i];
		}
		System.out.println(cnt);
	}
}
