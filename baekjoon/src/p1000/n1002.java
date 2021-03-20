package p1000;

import java.util.Scanner;

public class n1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		cnt = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;
		int[] arr = new int [cnt];
		for (int i = 0; i < cnt; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			if(r1 < r2) {
				int tmpX1 = x1;
				int tmpY1 = y1;
				int tmpR1 = r1;
				x1 = x2;
				y1 = y2;
				r1 = r2;
				x2 = tmpX1;
				y2 = tmpY1;
				r2 = tmpR1;
			}
			int length = ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			int sum = (r1+r2)*(r1+r2); //두 거리의 합의 제곱
			int minus = (r1-r2)*(r1-r2); // 두 거리의 차의 제곱
			
			if(sum < length || minus > length) {
				arr[i] = 0;
			}else if(r1 == r2 && length == 0) {
				arr[i] = -1;
			}else if(sum == length || minus == length) {
				arr[i] = 1;
			}else {
				arr[i] = 2;
			}
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}
}
