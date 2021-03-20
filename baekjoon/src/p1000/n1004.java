package p1000;

import java.util.Scanner;

public class n1004 {
	static int num = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			num = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int count2 = sc.nextInt();
			for (int j = 0; j < count2; j++) {
				int tx = sc.nextInt();
				int ty = sc.nextInt();
				int r = sc.nextInt();
				check(x1, y1, x2, y2, tx, ty, r);
			}
			System.out.println(num);
		}
		
	}
	static void check(int x1, int y1, int x2, int y2, int tx, int ty, int r) {
		if((x1-tx)*(x1-tx)+(y1-ty)*(y1-ty)< r*r || (x2-tx)*(x2-tx)+(y2-ty)*(y2-ty)< r*r) {
			if(!((x1-tx)*(x1-tx)+(y1-ty)*(y1-ty)< r*r && (x2-tx)*(x2-tx)+(y2-ty)*(y2-ty)< r*r))
			num++;
		}
	}
}
