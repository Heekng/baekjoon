package p1000;

import java.util.Scanner;

public class n9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result;
		if(num >= 90) result = "A";
		else if(num>= 80) result = "B";
		else if(num >= 70) result = "C";
		else if(num>= 60) result = "D";
		else result = "F";
		System.out.println(result);
	}
}
