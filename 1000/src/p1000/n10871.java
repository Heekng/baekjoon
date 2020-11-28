package p1000;

import java.util.Scanner;

public class n10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int max = sc.nextInt();
		int arr[] = new int [x];
		int cnt =0;
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			if (a<max) arr[cnt++] = a;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) break;
			System.out.print(arr[i]);
			if(arr[i+1] != 0) System.out.print(" ");
		}
		
	}
}
